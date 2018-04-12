# Standalong JAR app with build in JETTY server

this is just a maven project to create an embedded jetty jar file.  by itself it doesn't do anything it is a component for other projects

## Purpose of application

This application providing simple REST service functionality for testing.

## Building

  mvn build
  mvn compile
  mvn compile
  mvn package


## Running

java -cp target/embdjetty-1.0-jar-with-dependencies.jar org.orphanware.embdjetty.HttpServer

## Get REST Endpoint

[http://localhost:8080/service/test/data](http://localhost:8080/service/test/data)
