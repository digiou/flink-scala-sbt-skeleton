name := "flink-scala-sbt-skeleton"

version := "1.0"

scalaVersion := "2.11.8"

val flinkVersion = "1.1.3"

libraryDependencies ++= Seq(
  "org.apache.flink" %% "flink-scala" % flinkVersion,
  "org.apache.flink" %% "flink-streaming-scala" % flinkVersion,
  "org.apache.flink" %% "flink-clients" % flinkVersion
)
