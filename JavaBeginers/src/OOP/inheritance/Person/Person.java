package OOP.inheritance.Person;

public class Person {

    protected String Name;
    protected int Age;

    public Person(String Name, int Age) throws Exception {
        SetName(Name);
        SetAge(Age);
    }

    public void SetAge(int age) throws Exception {

        if (age < 0)
            throw new Exception("Age must be positive!");

        this.Age = age;
    }

    public void SetName(String Name) {

        this.Name = Name;
    }

    public int GetAge() {
        return this.Age;
    }

    public String GetName() {
        return this.Name;
    }

    @Override
    public String toString() {
        String str = "Name: " + Name + ", Age:" + Age;
        return str;
    }
}