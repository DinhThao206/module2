package Circle;

public class Circle {
    public double radius = 1.0;
    public String color = "red";

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + " and color=" + color;
    }

}
