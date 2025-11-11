import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Ban đầu: " + Arrays.toString(arr));
        arr = addLast(arr, 99);
        System.out.println("Thêm 99 vào cuối: " + Arrays.toString(arr));
//        arr = addLast(arr, 91);
//        System.out.println("Thêm 91 vào cuối: " + Arrays.toString(arr));

//        arr = removeFirst(arr);
//        System.out.println("Xóa phần tử đầu: " + Arrays.toString(arr));

//        arr = removeLast(arr);
//        System.out.println("Xóa phần tử cuối: " + Arrays.toString(arr));

//        arr = insertAt(arr, 77, 2);
//        System.out.println("Thêm 77 vào vị trí index = 2: " + Arrays.toString(arr));


    }

    public static int[] addLast(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) newArr[i] = arr[i];
        newArr[newArr.length - 1] = value;
        return newArr;
    }

    public static int[] removeFirst(int[] arr) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) newArr[i - 1] = arr[i];
        return newArr;
    }

    public static int[] removeLast(int[] arr) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) newArr[i] = arr[i];
        return newArr;
    }

    public static int[] insertAt(int[] arr, int value, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) newArr[i] = value;
            else newArr[i] = arr[j++];
        }
        return newArr;
    }

    public static int sumDigits(int n) {
        int sum = 0;
        n = Math.abs(n); // để xử lý cả số âm
        for (; n > 0; n /= 10) {
            sum += n % 10;
        }
        return sum;
    }

}
