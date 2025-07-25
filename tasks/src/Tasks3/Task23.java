package Tasks3;

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}


class MultifunctionPrinter implements Printable, Scannable {

  
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}


public class Task23 {
    public static void main(String[] args) {
        MultifunctionPrinter mfp = new MultifunctionPrinter();

     
        mfp.print();
        mfp.scan();
    }
}
