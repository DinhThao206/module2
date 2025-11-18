package animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal chicken = new Chicken();

        System.out.println("Tiger sound: " + tiger.makeSound());
        System.out.println("Chicken sound: " + chicken.makeSound());
    }
}
