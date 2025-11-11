public class Bracelet {
    private String material;
    private String color;
    private double size;
    private double price;
//4 thuộc tính
    public Bracelet() {
    }

    public Bracelet(String material, String color, double size, double price) {
        this.material = material;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getSize() { return size; }
    public void setSize(double size) { this.size = size; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void wear() { System.out.println("Wearing the " + material + " bracelet..."); }
    public void remove() { System.out.println("Removing the " + material + " bracelet..."); }

    public void showInfo() {
        System.out.println("Bracelet Info:");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
    }
}
class TestBracelet {
    public static void main(String[] args) {
        Bracelet gold = new Bracelet("Gold", "Yellow", 18.5, 2000);
        Bracelet silver = new Bracelet("Silver", "White", 17.0, 500);

        gold.showInfo();
        System.out.println("-------------------");
        silver.showInfo();
    }
}
