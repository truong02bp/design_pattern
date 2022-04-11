package adapter;

public class Client implements Target{
    @Override
    public void request() {
        System.out.println("Request");
    }
}
