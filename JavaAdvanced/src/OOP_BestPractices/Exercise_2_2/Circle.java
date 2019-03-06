package OOP_BestPractices.Exercise_2_2;

public abstract class Circle implements Shape {
    private double radius;

    public Double calculatePerimeter() {
        return 2.0 * Math.PI * radius;
    }

    public Double calculateSurface() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String shapeDetails() {
        String str = "The type is Circle! ";
        str+="Radius is: "+getRadius()+". ";
        str+="Perimeter is: "+calculatePerimeter()+". ";
        str+=" Surface is: "+calculateSurface()+".";
        return str;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}