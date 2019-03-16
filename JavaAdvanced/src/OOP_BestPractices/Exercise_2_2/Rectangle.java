package OOP_BestPractices.Exercise_2_2;

import java.util.Objects;

public class Rectangle implements Shape {

    private double width;
    private double height;

    Rectangle(double width, double height) {

        setHeight(height);
        setWidth(width);
    }

    private void setHeight(double height) {

        this.height = height;
    }

    private void setWidth(double width) {

        this.width = width;

    }


    @Override
    public double calculatePerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public double calculateSurface() {
        return width * height;
    }

    @Override
    public String shapeDetails() {

        final String shape = "Rectangle";
        double perimeter = calculatePerimeter();
        double surface = calculateSurface();

        return String.format("Shape type: %s \nHas width of: %.2f \nHas height of: %.2f \nHas perimeter of: %.2f \nHas surface of: %.2f\n"
                , shape
                , this.width
                , this.height
                , perimeter
                , surface);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(width, height);
    }

}

