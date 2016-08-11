#Spark2.0 New Functionality

## SparkSession: 
A new entry point that replaces the old SQLContext and HiveContext. For users of the DataFrame API, a common source of confusion for Spark is which “context” to use. Now you can use SparkSession, which subsumes both, as a single entry point, as demonstrated in this notebook. Note that the old SQLContext and HiveContext are still kept for backward compatibility.

## Catalog  API :  
In Spark2.0 ,A new Catalog API is introduced to access metadata.You can fetch all database list as well as table list using this API.

##Run this project

>sbt run
