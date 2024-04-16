Validation Facade Service
The Validation Facade Service is a Spring Boot application designed to provide server-side validation for input data across all REST API endpoints.

Table of Contents
1.Project Structure
2.Prerequisites
3.Testing the Application
4.Usage


1. Project Structure
validation-facade/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── core/
│   │   │               ├── controller/
│   │   │               │   └── ValidateFacadeController.java
│   │   │               ├── exception/
│   │   │               │   └── ValidationException.java
│   │   │               ├── model/
│   │   │               │   └── ValidateFacadeModel.java
│   │   │               └── service/
│   │   │                   └── ValidateFacadeService.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── core/
│                           └── ValidationFacadeApplicationTests.java
└── pom.xml

2.Prerequisites

Java JDK
Maven(for building the application)

3.Testing the Application

Unit tests are included to validate the functionality of the validation service. To run the unit tests, use the following command:

mvn test

4.Usage
Once the application is running, you can access the REST API endpoints defined in the ValidationFacadeController class. The endpoints will be available at http://localhost:8080/api/endpoint (default port is 8080).

To test the validation service, send POST requests to the /api/endpoint endpoint with JSON payloads containing input data.
