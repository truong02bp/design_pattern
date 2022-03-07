package interface_test;

public class FlyByAirplane implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly by airplane");
    }
}
