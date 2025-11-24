package list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Hello");
        myList.add("World");
        System.out.println("Element at index 0: " + myList.get(0));
        System.out.println("Element at index 1: " + myList.get(1));
        System.out.println("Size of list: " + myList.size());
    }
}
