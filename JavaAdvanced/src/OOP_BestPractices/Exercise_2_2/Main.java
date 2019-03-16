package OOP_BestPractices.Exercise_2_2;

public class Main {
    public static void main(String[] args) {
        ShapeInventory myInventory = new ShapeInventory();

        //add some control testing object
        myInventory.addShape(new Rectangle(20, 20));

        //printing this object to confirm that he is created
        myInventory.displayInventory();

        //adding more objects
        myInventory.addShape(new Rectangle(10, 20));
        myInventory.addShape(new Circle(5));

        //removing testing object
        myInventory.removeShape(new Rectangle(20, 20));

        //display remaining objects
        myInventory.displayInventory();
    }
}