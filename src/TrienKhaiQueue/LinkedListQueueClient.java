package TrienKhaiQueue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(37);
        queue.enqueue(38);
        queue.enqueue(102);
        queue.enqueue(0);
        queue.enqueue(0);
        queue.enqueue(12);
        queue.enqueue(45);
        queue.enqueue(65);
        queue.enqueue(76);
        System.out.println("Dequeued item is " + queue.dequeue());

    }
}
