import java.util.Scanner;

public class CalculateLoanInterest {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interestRate = 1.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Số tiền cần vay: ");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng: ");
        month = scanner.nextInt();
        System.out.println("Nhập lãi suất hàng năm theo phần trăm: ");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Số tiền lãi cần trả: "+ totalInterest);


    }
}
