import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class funtion {
    public static void main(String[] args) {
        System.out.println("Tổng 2 số là " + sum(3, 5));
        System.out.println("Tổng 2 số là " + sum(3, 48));
        System.out.println("Tổng 2 số là " + sum(3, 325));
        System.out.println("Tổng 2 số là " + sum(3, 528));
        System.out.println("Tổng 2 số là " + sum(3, 235));
        System.out.println("Tổng 2 số là " + sum(3, 5725));
        System.out.println(isEven(4));
        System.out.println("Số lớn nhất là : " + max(7, 9, 5));
        System.out.println("n có: " + factorial(5) + " giai thừa");
        System.out.println(isPrime(17));
        System.out.println("Tổng các phần tử là : " + sumArray(new int[]{1, 2, 3, 4}));
        System.out.println("Chuỗi đảo ngược là : " + reverseString("reversed"));
        System.out.println("Số lớn nhất trong mảng : " + findMax(new int[]{1, 5, 3, 9, 2}));
        System.out.println("Có " + countPrimes(new int[]{2, 3, 4, 5, 6}) + " số nguyên tố");
        System.out.println(isPalindrome("cgcgcgcg"));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }   

    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(@NotNull String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    @Contract(pure = true)
    public static int findMax(int @NotNull [] arr) {
        int max = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    @Contract(pure = true)
    public static int countPrimes(int @NotNull [] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(@NotNull String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
