import java.util.Scanner;

public class Rectangle1 {
    public static void main(String[] args) {
        float width = 5.5f;
        float height = 8.0f;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area of Rectangle: " + area);
    }
}
