package Thread2;

public class Main {
    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread thread1 = new Thread("A");
        Thread thread2 = new Thread("B");
        Thread thread3 = new Thread("C");

        System.out.println("Distance: 200km");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
