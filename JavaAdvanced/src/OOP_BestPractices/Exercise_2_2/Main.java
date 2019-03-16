package OOP_BestPractices.Exercise_2_2;

//import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    private static double generateNumber(int lowerLimit, int upperLimit) {
        return ((int) (ThreadLocalRandom.current().nextDouble(lowerLimit, upperLimit) * 100.0)) / 100.0;

    }

    public static void main(String[] args) {

       ShapeInventory myInventory = new ShapeInventory();
//        Random r = new Random;
        Rectangle testRemove = new Rectangle(2,2);

        myInventory.addShape(testRemove);
        myInventory.displayInventory();

        for (int i = 0; i < 3; i++) {

            myInventory.addShape(new Rectangle(generateNumber(1, 100), generateNumber(1, 100)));
            myInventory.addShape(new Circle(generateNumber(1, 10)));

        }

        myInventory.removeShape(new Rectangle(2,2));
        myInventory.displayInventory();

    }
}
