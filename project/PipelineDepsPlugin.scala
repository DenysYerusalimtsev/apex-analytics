import sbt._
import Keys._

import java.nio.file.Paths

object PipelineDepsPlugin extends AutoPlugin {

  override def trigger = noTrigger

  object autoImport {
    val updatePipelineDeps =
      taskKey[Unit]("update pipeline dependencies withing [# begin deps <deps> # end deps] block")
  }

  import autoImport._

  val pipelineFileGlob = "*pipeline*.yml"
  val codeBlockRegex = "( *)(# begin deps)((.|\\s)*?)(# end deps)".r
  val prefix = "- "

  def upsertDeps(pipeline: String, deps: Seq[String]): Option[String] = {
    codeBlockRegex.findFirstMatchIn(pipeline)
      .flatMap {
        case codeBlockRegex(spaces, _*) =>
          val padding = " " * spaces.length
          val depsCode = ("# begin deps" +: deps.map(prefix + _ + "/*") :+ "# end deps")
            .map(line => padding + line)
            .mkString("\n")
          Some(codeBlockRegex.replaceFirstIn(pipeline, depsCode))
        case _ =>
          None
      }
  }

  override lazy val projectSettings: Seq[Setting[_]] = Seq(
    updatePipelineDeps := {
      val stream = streams.value
      val build = loadedBuild.value
      val project = thisProject.value
      val rootPath = Paths.get(build.root)
      val projectPath = project.base.toPath
      val projectToPath = build.allProjectRefs
        .map {
          case (ref, project) =>
            val relative = rootPath.relativize(project.base.toPath).toString.replace("\\", "/")
            ref.project -> (project, relative)
        }
        .toMap

      def dependenciesRec(project: ResolvedProject): Seq[String] = {
        val (_, self) = projectToPath(project.id)
        self +: project.dependencies
          .flatMap { depRef =>
            val (depProject, _) = projectToPath(depRef.project.project)
            dependenciesRec(depProject)
          }
          .distinct
          .sorted
      }

      val deps = dependenciesRec(project)
      for {
        pipeline <- (project.base * pipelineFileGlob).get()
        updated <- upsertDeps(IO.read(pipeline), deps)
      } yield {
        IO.write(pipeline, updated)
        stream.log.info(s"Pipeline dependencies are updated for $pipeline")
      }
    })
}
