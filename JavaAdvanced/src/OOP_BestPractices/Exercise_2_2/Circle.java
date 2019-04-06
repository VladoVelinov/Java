package OOP_BestPractices.Exercise_2_2;

import java.util.Objects;

public class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        setRadius(radius);
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateSurface() {
        return Math.PI * radius * radius;
    }

    @Override
    public String shapeDetails() {
        final String shape = "Circle";
        double perimeter = calculatePerimeter();
        double surface = calculateSurface();

        return String.format("Shape type: %s \nHas radius of: %.2f \nHas perimeter of: %.2f \nHas surface of: %.2f\n"
                , shape
                , this.radius
                , perimeter
                , surface);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
