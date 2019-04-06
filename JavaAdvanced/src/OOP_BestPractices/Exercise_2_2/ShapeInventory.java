package OOP_BestPractices.Exercise_2_2;

import java.util.ArrayList;

class ShapeInventory {

    private ArrayList<Shape> shapes = new ArrayList<>();

    void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    void removeShape(Shape shape) {
        this.shapes.remove(shape);
    }

    void displayInventory() {
        if (this.shapes.isEmpty()) {
            System.out.println("Inventory is Empty!");
            return;
        }

        for (Shape shape : this.shapes) {
            System.out.println(shape.shapeDetails());
        }
    }
}
