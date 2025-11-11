public class Student {
    private String name;
    private double[] scores;

    public Student() {

    }

    public Student(String name, double[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public double average() {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum / scores.length;
    }

    public void display() {
        System.out.println("Tên: " + name + ", Điểm TB: " + average());

    }
}
 class StudentDemo {
    public static void main(String[] args) {
        // Cách 1
        Student s1 = new Student();
        s1.setName("Lan");
        s1.setScores(new double[]{8.0, 7.5, 9.0});

        Student s2 = new Student();
        s2.setName("Hùng");
        s2.setScores(new double[]{6.0, 5.5, 7.0});

        Student s3 = new Student();
        s3.setName("Mai");
        s3.setScores(new double[]{9.5, 8.5, 9.0});

        s1.display();
        s2.display();
        s3.display();

        // Cách 2
        Student s4 = new Student("Khoa", new double[]{7.0, 8.0, 6.5});
        Student s5 = new Student("Duy", new double[]{5.0, 6.0, 5.5});
        Student s6 = new Student("Trang", new double[]{9.0, 9.5, 10.0});

        s4.display();
        s5.display();
        s6.display();
    }
}
