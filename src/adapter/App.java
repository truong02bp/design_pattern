package adapter;

public class App {
    public static void main(String[] args) {
        Client client = new Client();
        Adapter adapter = new Adapter(client);
        client.request();
        System.out.println("------------------------");
        adapter.newRequest();
    }
}
