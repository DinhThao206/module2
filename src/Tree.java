public class Tree {
    private String name;
    private int age;
    private double height;
    private String type;

    public Tree() {
    }

    public Tree(String name, int age, double height, String type) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void grow() {
        System.out.println(name + " phát triển");

    }

    public void photosynthesize() {
        System.out.println(name + " quang hợp");
    }

    public void shedLeaves() {
        System.out.println(name + " rụng lá");
    }

    public void showInfo() {
        System.out.println("Tree Info:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + " m");
        System.out.println("Type: " + type);
    }
}

class TestTree {
    public static void main(String[] args) {
        Tree mango = new Tree("Mango Tree", 5, 3.2, "Fruit");
        Tree pine = new Tree("Pine Tree", 10, 7.5, "Wood");

        mango.showInfo();
        System.out.println("-------------------");
        pine.showInfo();
    }
}
