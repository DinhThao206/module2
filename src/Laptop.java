public class Laptop {
    private String brand;
    private String model;
    private String cpu;
    private double price;

    public Laptop() {
    }

    public Laptop(String brand, String model, String cpu, double price) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start() {
        System.out.println(brand + " " + model + " is starting...");
    }

    public void shutdown() {
        System.out.println(brand + " " + model + " is shutting down...");
    }

    public void showInfo() {
        System.out.println("Laptop Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("CPU: " + cpu);
        System.out.println("Price: " + price);
    }
}

class TestLaptop {
    public static void main(String[] args) {
        Laptop dell = new Laptop("Dell", "XPS 13", "Intel i7", 1400);
        Laptop macbook = new Laptop("Apple", "MacBook Pro", "M3", 2500);

        dell.showInfo();
        System.out.println("-------------------");
        macbook.showInfo();
    }
}
