
public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;

    public SwitchButton() {
        this.status = false;
    }

    public void connectToLamp(ElectricLamp lamp) {
        this.lamp = lamp;
    }

    public void switchOn() {
        if (lamp != null) {
            status = true;
            lamp.turnOn();
        } else {
            System.out.println(" Chưa kết nối công tắc với bóng đèn!");
        }
    }

    public void switchOff() {
        if (lamp != null) {
            status = false;
            lamp.turnOff();
        } else {
            System.out.println(" Chưa kết nối công tắc với bóng đèn!");
        }
    }

    public boolean isOn() {
        return status;
    }
}

