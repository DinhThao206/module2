package Geometry;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.toString());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(2.0, 3.0);
        System.out.println(rectangle2.toString());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

        Rectangle rectangle3 = new Rectangle(4.0, 5.0, "Red", true);
        System.out.println(rectangle3.toString());
        System.out.println("Area: " + rectangle3.getArea());
        System.out.println("Perimeter: " + rectangle3.getPerimeter());
    }
}
