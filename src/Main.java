public class Main {
    public static void main(String[] args) {
        ElectricLamp lamp = new ElectricLamp();
        SwitchButton button = new SwitchButton();
        button.connectToLamp(lamp);
        for (int i = 1; i <= 20; i++) {
            System.out.println("---- Lần " + i + " ----");
            button.switchOn();
            button.switchOff();
        }
    }
}
