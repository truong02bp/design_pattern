package singleton.for_multi_thread;

public class Printer {

    private volatile static Printer printer;

    private Printer() {
    }

    public static Printer getInstance() {
        if (printer == null) {
            synchronized (Printer.class) {
                if (printer == null) {
                    printer = new Printer();
                }
            }
        }
        return printer;
    }

    public void print() {
        System.out.println("Print by : " + printer.toString());
    }
}
