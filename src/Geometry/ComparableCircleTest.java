package Geometry;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(3.5);
        ComparableCircle circle2 = new ComparableCircle(4.5);

        int comparisonResult = circle1.compareTo(circle2);
        if (comparisonResult > 0) {
            System.out.println("Circle1 is larger than Circle2");
        } else if (comparisonResult < 0) {
            System.out.println("Circle1 is smaller than Circle2");
        } else {
            System.out.println("Circle1 is equal to Circle2");
        }
    }
}
