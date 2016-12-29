### Template for SBT Spark Projects

#####Use this project as a template to build and upload a library in your Databricks workspace and attach the library to a cluster

Steps:

* Clone this repo

```git clone https://github.com/ganeshchand/databricks-sbt-example.git```

*  Update the following properties in build.sbt:

 * dbcUsername
 * dbcPassword
 * dbcApiUrl
 * dbcClusters
 * dbcLibraryPath

#### To upload a jar and attach it to a cluster in Databricks

use `dbcDeploy` sbt command
