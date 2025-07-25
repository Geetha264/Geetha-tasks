package Tasks3;

interface RemoteControl {
    void turnOn();
    
    default void batteryStatus() {
        System.out.println("Battery status: Battery is full.");
    }
}

class TV implements RemoteControl {


    public void turnOn() {
        System.out.println("TV is now ON.");
    }
}

public class task21 {
    public static void main(String[] args) {
        TV myTV = new TV();
        myTV.turnOn();
        myTV.batteryStatus();
    }
}
