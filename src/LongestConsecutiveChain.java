import java.util.LinkedList;
import java.util.Scanner;

public class LongestConsecutiveChain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        System.out.print("Nhập chuỗi ký tự: ");
        String string = input.nextLine();
        for (int i =0 ; i < string.length(); i++){
            if(list.size() > i && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))){

                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character character : max) {
            System.out.print(character);
        }
        System.out.println();
    }
}
