package OOP_BestPractices.Exercise_2_2;

public abstract class Rectangle implements Shape {
    private double width;
    private double height;

    public Double calculatePerimeter() {
        return 2.0 * (this.width + this.height);
    }

    public Double calculateSurface() {
        return this.width * this.height;
    }

    public String shapeDetails() {
        String str = "The type is Rectangle! ";
        str+="Width is: "+getWidth()+". ";
        str+="Height is: "+getHeight()+". ";
        str+="Perimeter is: "+calculatePerimeter()+". ";
        str+="Surface is: "+calculateSurface()+".";
        return str;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}