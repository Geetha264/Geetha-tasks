package tasks2;

abstract class Appliance {
     abstract void turnOn();
}
interface Connectable {
     void connect();
}
class SmartTV extends Appliance implements Connectable {
     public void turnOn() {
        System.out.println("SmartTV is ON");
 }
 public void connect() {
        System.out.println("SmartTV connected to WiFi");
 }
}
public class Task8 {
       public static void main(String[] args) {
		  SmartTV t = new SmartTV();
          t.turnOn();
          t.connect();
}
}
