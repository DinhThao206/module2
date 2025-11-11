public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    public Car() {
    }
    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void start() {
        System.out.println(brand + " " + model + " is starting...");
    }

    public void stop() {
        System.out.println(brand + " " + model + " is stopping...");
    }

    public void drive() {
        System.out.println(brand + " " + model + " is driving...");
    }

    public void showInfo() {
        System.out.println("Car Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
}
class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020, "Black");
        Car car2 = new Car("Honda", "Civic", 2022, "White");
        car1.showInfo();
        car1.start();
        car1.drive();
        car1.stop();

        System.out.println("-------------------");

    }
}
