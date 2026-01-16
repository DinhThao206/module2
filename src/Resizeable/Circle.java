package Resizeable;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double percent) {
        radius *= (1 + percent / 100);
    }
}
