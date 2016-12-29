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

dbcUsername := System.getenv("DBCLOUD_USER")

dbcPassword := System.getenv("DBCLOUD_PASSWORD")

dbcApiUrl := System.getenv("DBCLOUD_SHARD")+"/api/1.2" // DO NOT use /api/2.0

dbcClusters += "MY_CLUSTER_NAME" // use "ALL_CLUSTERS" to attach to all clusters

dbcLibraryPath := "/Users/"+System.getenv("DBCLOUD_USER")+"/lib"

dbcRestartOnAttach := true // Default true

