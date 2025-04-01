abstract class SmartDevice {
    String deviceName;

    // Abstract methods turnOn and turnOff
    abstract void turnOn();
    abstract void turnOff();

    void showStatus() {
        System.out.println("Device Name: " + deviceName);
    }
}

class SmartLight extends SmartDevice{
    String deviceName = "Smart Light";

    void showStatus() {
        System.out.println("Device: " + deviceName);
    }
    
    void turnOn() {
        System.out.println("Light is now ON");
    }

    void turnOff() {
        System.out.println("Light is now OFF");
    }
    
}
class SmartSpeaker extends SmartDevice{
    String deviceName = "Smart Speaker";

    void showStatus() {
        System.out.println("Device: " + deviceName);
    }
    
    void turnOn() {
        System.out.println("Speaker is now playing music");
    }

    void turnOff() {
        System.out.println("Speaker is now OFF");
    }
    
}

public class Main {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight();
        light.showStatus();
        light.turnOn();
        light.turnOff();

        SmartDevice speaker = new SmartSpeaker();
        speaker.showStatus();
        speaker.turnOn();
        speaker.turnOff();
    }
}
