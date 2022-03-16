package command.receiver;

public class CeilingFan {

    private final String location;
    private boolean isOn;

    public CeilingFan(String location) {
        this.location = location;
        this.isOn = false;
    }

    public void on() {
        isOn = true;
        System.out.println(this);
    }

    public void off() {
        isOn = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CeilingFan{" +
                "location='" + location + '\'' +
                ", isOn=" + isOn +
                '}';
    }
}
