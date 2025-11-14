package Circle;

public class testCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1.toString());
        System.out.println("Volume: " + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(2.0, 5.0);
        System.out.println(cylinder2.toString());
        System.out.println("Volume: " + cylinder2.getVolume());

        Cylinder cylinder3 = new Cylinder(3.0, 7.0, "blue");
        System.out.println(cylinder3.toString());
        System.out.println("Volume: " + cylinder3.getVolume());
    }
}
