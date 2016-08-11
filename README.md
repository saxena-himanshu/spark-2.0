#Spark2.0 New Functionality


> This tutorial provides a quick introduction to using Spark2.0 . It demonstrates the basic functionality of new API

> This is the start of using Spark with Scala, from next week onwards we would be working on this tutorial to make it grow.
> We would look at how we can add more functionality into it , then we would be adding more modules to it together. If you have any
>changes then feel free to send in pull requests and we would do the merges :) Stay tuned.

## SparkSession: 
A new entry point that replaces the old SQLContext and HiveContext. For users of the DataFrame API, a common source of confusion for Spark is which “context” to use. Now you can use SparkSession, which subsumes both, as a single entry point, as demonstrated in this notebook. Note that the old SQLContext and HiveContext are still kept for backward compatibility.

## Catalog  API :  
In Spark2.0 ,A new Catalog API is introduced to access metadata.You can fetch all database list as well as table list using this API.

##Run this project

>sbt run
