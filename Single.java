// Single Responsibility Principle
interface Printable {
    void print(String data);
}

class InvoicePrinter implements Printable {
    public void print(String data) {
        System.out.println("Printing Invoice: " );
    }
}

public class Single {
    private String details = "Invoice 12345, Total: 250";

    public String getInvoiceDetails() {
        return details;
    }

    public static void main(String[] args) {
        Single invoice = new Single();
        Printable printer = new InvoicePrinter();
        printer.print(invoice.getInvoiceDetails());
    }
}
