package Tasks3;


interface Rc {

    void turnOn();

    default void batteryStatus() {
        System.out.println("Battery status: Battery is full.");
    }

    static void info() {
        System.out.println("RemoteControl interface: Controls electronic devices.");
    }
}

class tv implements Rc {

    public void turnOn() {
        System.out.println("TV is now ON.");
    }
}


public class Test22 {
    public static void main(String[] args) {
        tv myTV = new tv();
        myTV.turnOn();
        myTV.batteryStatus();
        Rc.info();
    }
}
