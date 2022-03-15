package singleton.normal;


public class Main {
    public static void main(String[] args) {
        Printer printWriter = Printer.getInstance();
        printWriter.print();
    }
}
