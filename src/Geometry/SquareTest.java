package Geometry;

public class SquareTest {
    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println(square1.toString());
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());

        Square square2 = new Square(4.0);
        System.out.println(square2.toString());
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());

        Square square3 = new Square(5.0, "Blue", false);
        System.out.println(square3.toString());
        System.out.println("Area: " + square3.getArea());
        System.out.println("Perimeter: " + square3.getPerimeter());
    }
}
