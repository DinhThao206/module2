package LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(1214);
        ll.addFirst(1345);
        ll.addFirst(134);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }
}
