package com.databricks.example

import org.apache.spark.sql.SparkSession

object SparkApp {
  def main(args: Array[String]) {

    val spark = SparkSession.builder()
        .appName("Sample app")
      .getOrCreate()
    import spark.implicits._

    val df = spark.range(1, 10).toDF("id")
    println("Test")
    println(df.count())
  }
}
