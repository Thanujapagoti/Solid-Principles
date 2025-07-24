// Interface Segregation Principle
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class PrintMachine implements Printable {
    public void print() {
        System.out.println("Printing document...");
    }
}

class ScanMachine implements Scannable {
    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Printable p = new PrintMachine();
        p.print();
    }
}
