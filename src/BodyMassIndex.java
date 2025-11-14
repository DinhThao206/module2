import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Đo chỉ số khối cơ thể (BMI)");
        System.out.print("Nhập cân nặng của bạn (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Nhập chiều cao của bạn (m): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("");
        System.out.printf("Chỉ số BMI của bạn là: %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("Bạn bị thiếu cân.");
        } else if (bmi < 24.9) {
            System.out.println("Bạn có cân nặng bình thường.");
        } else if (bmi < 29.9) {
            System.out.println("Bạn bị thừa cân.");
        } else {
            System.out.println("Bạn bị béo phì.");
        }
    }
}
