import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + "not is prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " not is prime");
            }
        }
    }

}

