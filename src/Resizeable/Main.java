package Resizeable;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Square(5)
        };

        Random random = new Random();

        for (Shape shape : shapes) {
            double percent = random.nextInt(100) + 1;

            System.out.println("Resize: " + percent + "%");
            System.out.println("Diện tích trước: " + shape.getArea());

            shape.resize(percent);

            System.out.println("Diện tích sau: " + shape.getArea());
            System.out.println("------------------------");
        }
    }
}
