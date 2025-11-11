import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[] students = {"tèo", "tùng", "tiến"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên một học sinh: ");
        Scanner scanner;
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của học sinh " + input_name + " là: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy học sinh: " + input_name + " trong danh sách.");
        }
    }
}
