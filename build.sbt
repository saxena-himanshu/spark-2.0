name := "Spark2.0Examples"

version := "1.0"

scalaVersion := "2.10.6"

val sparkVersion = "2.0.0"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.10" % "2.0.0",
 "org.apache.spark" % "spark-sql_2.10" % "2.0.0"
 )
    
