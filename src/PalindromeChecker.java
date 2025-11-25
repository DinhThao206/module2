import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhập kí tự: ");
        String input = scanner.nextLine();
        String processed = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < processed.length(); i++) {
            char c = processed.charAt(i);
            stack.push(c);
            queue.add(c);
        }
        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Chuỗi là Palindrome");
        } else {
            System.out.println("Chuỗi không phải Palindrome");
        }
    }
}
