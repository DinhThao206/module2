package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm " +
                    equation.getRoot1() + " và " +
                    equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có một nghiệm " + equation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}