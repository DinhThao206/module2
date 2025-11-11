// ElectricLamp.java
public class ElectricLamp {
    private boolean status;

    public ElectricLamp() {
        this.status = false;
    }

    public void turnOn() {
        status = true;
        System.out.println("Tắt");
    }

    public void turnOff() {
        status = false;
        System.out.println("Bật");
    }

    public boolean isOn() {
        return status;
    }
}
