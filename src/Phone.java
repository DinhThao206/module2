public class Phone {
    private String brand;
    private String model;
    private double price;
    private String color;

    public Phone() {
    }

    public Phone(String brand, String model, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void call() {
        System.out.println(brand + " " + model + " is calling...");
    }

    public void message() {
        System.out.println(brand + " " + model + " is sending a message...");
    }

    public void showInfo() {
        System.out.println("Phone Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
    }
}
class TestPhone {
    public static void main(String[] args) {
        Phone iphone = new Phone("Apple", "iPhone 15", 1200, "Black");
        Phone samsung = new Phone("Samsung", "Galaxy S24", 950, "White");

        iphone.showInfo();
        System.out.println("-------------------");
        samsung.showInfo();
    }
}

