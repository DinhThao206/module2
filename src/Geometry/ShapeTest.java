package Geometry;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());

        Shape shape2 = new Shape("Blue", false);
        System.out.println(shape2.toString());

        Shape shape3 = new Shape();
        System.out.println(shape3.toString());

        Shape shape4 = new Shape("Gray", false);
        System.out.println(shape4.toString());
    }
}
