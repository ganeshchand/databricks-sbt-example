### Template for SBT Spark Projects

#####Use this project as a template to build and upload a library in your Databricks workspace and attach the library to a cluster

Steps:

* Clone this repo

```
git clone https://github.com/ganeshchand/databricks-sbt-example.git
```

* You could hardcode values for the following properties directly in build.sbt. However, the recommended approach is to set your environment variables so that build.sbt doesn't become user specific.

 * dbcUsername
 * dbcPassword
 * dbcApiUrl
 * dbcClusters
 * dbcLibraryPath

 Set Environment variables:

 ```
 $ vi ~/.bash_profile
 DBCLOUD_USER=someuser@databricks.com
 DBCLOUD_PASSWORD=mypassword
 DBCLOUD_SHARD=https://mycompany.cloud.databricks.com
 export DBCLOUD_USER
 export DBCLOUD_PASSWORD
 export DBCLOUD_SHARD
 ```

* To upload a jar and attach it to a cluster in Databricks

**Note**: If you haven't updated `dbcLibraryPath` in build.sbt, by default, I have set it to be /Users/username@databricks.com/lib. You have to make sure the 'lib' folder exists in your home directory. You can also comment `dbcLibraryPath` altogether in which case, the jar file will be uploaded under root directory.

```
$ sbt
> set dbcClusters := Seq("CLUSTER_NAME")

> dbcListClusters // run this command to make sure the setup works

> set dbcClusters := Seq("my_cluster_name") // you can override the cluster name specified in build.sbt

> dbcDeploy
 
Uploading databricks-sbt-example_2.11-0.1-SNAPSHOT.jar

Attaching databricks-sbt-example_2.11-0.1-SNAPSHOT.jar to cluster 'ganesh-sbt-plugin-test'

Restarting cluster: CLUSTER_NAME

```

* Publishing Library Release

```sbt release```



