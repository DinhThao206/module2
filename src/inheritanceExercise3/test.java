package inheritanceExercise3;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println(p3);
        System.out.println(Arrays.toString(p3.getXYZ()));

    }
}
