package Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài:");
        double width = scanner.nextDouble();
        System.out.print("Nhập chiều rộng:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Hình chữ nhật có chu vi: " + rectangle.getPerimeter());
        System.out.println("Hình chữ nhật có chiều rộng: " + rectangle.getArena());
    }
}

