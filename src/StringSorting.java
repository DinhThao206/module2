import java.util.LinkedList;

public class StringSorting {
    public static void main(String[] args) {
        String[] strings = {"banana", "apple", "orange", "kiwi", "grape"};
        LinkedList<Character> max = new LinkedList<>();

        for (String s : strings) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(s.charAt(0));
            for (int j = 1; j < s.length(); j++) {
                char current = s.charAt(j);
                if (current > list.getLast()) {
                    list.add(current);
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
