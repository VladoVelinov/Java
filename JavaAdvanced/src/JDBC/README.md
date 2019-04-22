# JDBC (Java Database Connectivity)

## Exercises:

1. Create a program that connects to the classicmodels database and retrieves and prints information about customers in CA.

2. Modify the previous program to use a prepared statement. Add the additional conditions for customers to have a credit limit above 100 000.

3. Create a program that changes the credit limit of a customer with customer number 450 to 80 000. Check from the workbench that after the execution of the program, the change was indeed made.

4. Write a program that creates a new user in the bank database. The bank has a rule that whenever a new user is created, he automatically gets a checking and a saving account. Your program should create the user and the two associated accounts in a single DB transaction.

5. Create a Spring project, using the Spring Boot Initializr. Include JDBC and MySQL dependencies. Write query method to retrieve from the bank database a single user given the ID for that user.

6. Add functionality to retrieve all users in the bank.

7. Add functionality to delete an user.

8. Add functionality to create a new bank user and save him in the database.

9. Create functionality to add, delete, modify, and retrieve user accounts. 

10. Add a service that creates a new user with two associated accounts: savings and checking. The service should also be able to retrieve an user and all associated accounts, given the user ID. 

11(Optional). Add methods that search for users by name or other attributes.