package Student;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Nam");
        Student s2 = new Student(222, "Nghia");
        s1.display();
        s2.display();
    }
}
