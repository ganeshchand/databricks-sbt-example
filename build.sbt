name := "Databricks SBT Example"

version := "0.1-SNAPSHOT"

organization := "com.databricks.example"

scalaVersion := "2.11.8"


libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.1.0" % "provided",
  "org.apache.spark" %% "spark-sql" % "2.1.0" % "provided"
)


resolvers += "bintray-spark-packages" at
  "https://dl.bintray.com/spark-packages/maven/"

resolvers += "Typesafe Simple Repository" at
 "http://repo.typesafe.com/typesafe/simple/maven-releases/"


dbcUsername := "someuser@databricks.com"

dbcPassword := "yourpassword"


dbcApiUrl := "https://company.cloud.databricks.com/api/2.0"


dbcClusters += "my-running-cluster"


dbcLibraryPath := "/Users/someuser@databricks.com/lib"  // Default is "/"


dbcRestartOnAttach := true // Default true
