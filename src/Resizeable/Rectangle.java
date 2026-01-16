package Resizeable;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {
        double factor = 1 + percent / 100;
        width *= factor;
        height *= factor;
    }
}
