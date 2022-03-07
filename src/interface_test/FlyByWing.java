package interface_test;

public class FlyByWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Wing wing");
    }
}
