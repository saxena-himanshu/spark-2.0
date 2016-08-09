package com.spark2new.examples.spark2

import org.apache.spark.sql.SparkSession

/**
  * Spark Session example
  *
  */
object SparkSessionExample {

  def main(args: Array[String]) {

    val sparkSession = SparkSession.builder.
      master("local")
      .appName("spark session example")
      .getOrCreate()

    val df = sparkSession.read.option("header","true").csv("src/main/resources/mariadata_200.csv")

    df.show()
    
    sparkSession.stop()

  }

}
