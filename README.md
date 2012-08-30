# Assay Depot Java Example

This is a sample Java application that makes use of the Assay Depot API and the Assay Depot Java SDK. More information can be found here: http://assaydepot.github.com/api/

## Assay Depot Developer Program

An authentication token is required for the API to function. If you would like access to the API, please email cpetersen@assaydepot.com.

## Building with Maven

This example uses maven as the build system. To build the example use the following command:

```
mvn compile
```

## Running with Maven


The sample application searches for vendors using the Assay Depot API. A developer token is required. You can run the app with the following command:
```
mvn exec:java -Dexec.mainClass="com.assaydepot.example.AssayDepotExample" -Dexec.args="https://www.assaydepot.com/api [your token here] [your search term here]"
```