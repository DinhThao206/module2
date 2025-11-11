import java.util.Scanner;

public class TemperatureConversionProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== MENU CHUYỂN ĐỔI NHIỆT ĐỘ =====");
            System.out.println("1. Fahrenheit → Celsius");
            System.out.println("2. Celsius → Fahrenheit");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Nhập nhiệt độ (°F): ");
                double f = input.nextDouble();
                System.out.printf("→ %.2f°F = %.2f°C%n", f, (5.0 / 9) * (f - 32));
            }
            else if (choice == 2) {
                System.out.print("Nhập nhiệt độ (°C): ");
                double c = input.nextDouble();
                System.out.printf("→ %.2f°C = %.2f°F%n", c, (9.0 / 5) * c + 32);
            }
            else if (choice != 0) {
                System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

        System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
        input.close();
    }
}
