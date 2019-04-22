# Introduction to the Spring Framework.

## Exercises:

### Exercise 1 - Bank Deposit Demo

Create a simple Bank Deposit Request service. It should contain a controller, a service, and a DAO class. These classes would represent the three common layers in business applications: UI, services, and data. Use the Spring XML bean configuration to wire the beans.

![](./DOC/Exercise%201.PNG)

### Exercise 2 - Bank Deposit Demo enhancement

Populate the list of bank deposits in the BankDepositDAO with a few items at application startup. This would simulate the existence of a database. Then from the main class repeatedly prompt the user for the details of a new bank deposit, create it and then list all existing deposits to verify the success of the operation.
 
 ### Exercise 3  Bank Deposit Demo with Interfaces
In exercise 1 the classes depended directly on their implementations. Let us apply the principle "code to interfaces". The class will hold a reference to an interface from the lower layer, while the XML configuration will be wiring a specific implementation. This would allow for an implementation from the lower layer to be replaced with a different one, without having to change the class that calls it. For example, if the bank decided to change their storage from Oracle to Mongo DB, it will change the DAO implementation class, without having to change anything else.

![](./DOC/Exercise%202.PNG)  

### Exercise 4 - Bank Deposit Demo with Annotations

Modify the bank deposit application, so that it uses annotations for wiring its components.

### Exercise 5 - Bank Customer Service

Add customer management functionality to our bank application. Create the corresponding Controller, Service, and DAO interfaces and implementations. The user should be able to add new customers and list the existing customers. The customer details can include for example an ID, name, and address.

 ## Resources:
 
 * [Basic Spring Boot maven config](./DOC/pom.xml)
 * [Basic Spring XML bean config](./DOC/bareBonesApplicationContext.xml)
 * [Spring XML bean config with component scan](./DOC/componentScanAppContext.xml)