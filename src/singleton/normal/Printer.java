package singleton.normal;

public class Printer {

    private static Printer printer;

    private Printer() {
    }

    public static Printer getInstance() {
        if (printer == null) {
            printer = new Printer();
        }
        return printer;
    }

    public void print() {
        System.out.println("Print by : " + printer.toString());
    }
}
