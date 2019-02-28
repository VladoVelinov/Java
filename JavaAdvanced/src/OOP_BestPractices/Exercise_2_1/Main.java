/*
Exercise 2.1:
Define a class Person with properties id, firstName, and familyName. The method personalDetails() of Person returns the
full name. Define a class Student that inherits from Person. The Student has a grade. It overrides the personalDetails()
method, which in addition to the full name returns the grade. Define a class Worker that inherits from Person. The worker
has the properties dailyWage and workWours. Also, implement a method getHourlyWage(), which calculates the earnings per
hour, based on the daily wage and the hours worked. The personalDetails() implementation of the Worker class returns all
the relevant information. Create a HumanResources class, that has an array of Person objects. It has methods to add and
remove Person objects. When a person is added, a unique ID is assigned to that person. The HumanResources class has also
a generateReport() method, that prints the personal details of all contained Person objects. Write a program, that adds
several Student and Worker objects to the HumanResources class, then call the generateReport() method. Create an UML
class diagram that reflects the classes in the problem.
Made by Vladislav Velinov.
*/
package OOP_BestPractices.Exercise_2_1;

public class Main {
    public static void main(String[] args) {
        HumanResources hr = new HumanResources();
        hr.addPerson(new Student(null, "John", "Doe", 5));
        hr.addPerson(new Person(null, "Jane", "Doe"));
        hr.addPerson(new Worker(null, "Bratt", "Pitt", 20, 8));
        hr.addPerson(new Worker(null, "Jack", "Nickolson", 500, 2));

        hr.generateReport();
    }
}