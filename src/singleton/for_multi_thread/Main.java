package singleton.for_multi_thread;

public class Main {
    public static void main(String[] args) {
        Runnable target;
        Thread thread = new Thread(() -> {
            Printer printWriter = Printer.getInstance();
            printWriter.print();
        });
        Thread thread2 = new Thread(() -> {
            Printer printWriter = Printer.getInstance();
            printWriter.print();
        });

        thread.start();
        thread2.start();

    }
}
