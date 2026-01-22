package Shapesss;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Square(4),
                new Rectangle(3, 6)
        };

        for (Shape shape : shapes) {
            System.out.println("Diện tích: " + shape.getArea());

            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }

            System.out.println("          ");
        }
    }
}