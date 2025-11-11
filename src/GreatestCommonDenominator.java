import java.util.Scanner;

public class GreatestCommonDenominator {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = input.nextInt();
        System.out.println("Nhập số b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không này không tồn tại");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Ước số chung lớn nhất của 2 số là: " + a);
    }
}
