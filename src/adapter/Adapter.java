package adapter;

public class Adapter implements NewTarget {

    private Target target;

    public Adapter(Target target) {
        this.target = target;
    }

    @Override
    public void newRequest() {
        target.request();
        System.out.println("abccccc");
    }

}
