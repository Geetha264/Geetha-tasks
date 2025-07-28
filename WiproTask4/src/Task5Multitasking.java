
class MyPriorityThread extends Thread {
    public MyPriorityThread(String name) {
        super(name); 
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " is running with priority " + getPriority());
        }
    }
}

public class Task5Multitasking {
    public static void main(String[] args) {
        MyPriorityThread t1 = new MyPriorityThread("Thread-1");
        MyPriorityThread t2 = new MyPriorityThread("Thread-2");
        MyPriorityThread t3 = new MyPriorityThread("Thread-3");

        t1.setPriority(Thread.MIN_PRIORITY);   
        t2.setPriority(Thread.NORM_PRIORITY);  
        t3.setPriority(Thread.MAX_PRIORITY);   

        System.out.println(t1.getName() + " priority: " + t1.getPriority());
        System.out.println(t2.getName() + " priority: " + t2.getPriority());
        System.out.println(t3.getName() + " priority: " + t3.getPriority());


        t1.start();
        t2.start();
        t3.start();
    }
}
