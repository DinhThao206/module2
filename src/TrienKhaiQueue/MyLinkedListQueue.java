package TrienKhaiQueue;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue(){
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){
        Node newNode = new Node(key);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int dequeue(){
        if (head == null) {
            throw new IllegalStateException("Queue is empty");
        }
        int dequeuedKey = head.key;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return dequeuedKey;
    }
}
