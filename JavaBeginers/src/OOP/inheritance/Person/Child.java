package OOP.inheritance.Person;

public class Child extends Person {

    public Child(String name, int age) throws Exception {
        super(name, age);
    }

    @Override
    public void SetAge(int age) throws Exception {

        if (age < 0)
            throw new Exception("Age must be positive!");

        if (age > 15)
            throw new Exception("Child's age must be lesser than 15!");

        this.Age = age;
    }
}