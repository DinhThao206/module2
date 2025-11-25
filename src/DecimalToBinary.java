import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thập phân: ");
        int decimal = sc.nextInt();

        if (decimal == 0) {
            System.out.println("Hệ nhị phân: 0");
            return;
        }

        Stack<Integer> stack = new Stack<>();
        int number = decimal;
        while (number > 0) {
            int remainder = number % 2;
            stack.push(remainder);
            number = number / 2;
        }
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        System.out.println("Số " + decimal + " trong hệ nhị phân là: " + binary);
    }
}
