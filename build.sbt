name := "spark-jdbc"

version := "0.1"

organization := "com.luogankun.spark"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.2.0" % "provided"

resolvers += "Spark Staging Repository" at "https://repository.apache.org/content/repositories/orgapachespark-1038/"

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (version.value.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := (
  <url>https://github.com/databricks/spark-jdbc</url>
  <licenses>
    <license>
      <name>Apache License, Verision 2.0</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:databricks/spark-jdbc.git</url>
    <connection>scm:git:git@github.com:databricks/spark-csv.git</connection>
  </scm>
  <developers>
    <developer>
      <id>falaki</id>
      <name>Hossein Falaki</name>
      <url>http://www.falaki.net</url>
    </developer>
  </developers>)

// Enable Junit testing.
// libraryDependencies += "com.novocode" % "junit-interface" % "0.9" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1" % "test"
