import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng 1: ");
        int size1 = input.nextInt();
        System.out.print("Nhập kích thước mảng 2: ");
        int size2 = input.nextInt();

        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        System.out.println("Nhập các phần tử cho mảng 1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array1[i] = input.nextInt();
        }
        System.out.println("Nhập các phần tử cho mảng 2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array2[i] = input.nextInt();
        }
        int[] array3 = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }
        System.out.println("Mảng sau khi gộp là:");
        for (int value : array3) {
            System.out.print(value + " ");
        }

        input.close();
    }
}