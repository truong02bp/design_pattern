package command.receiver;

public class CeilingFan {

    public enum SpeedStatus {
        LOW,
        MEDIUM,
        HIGH
    }


    private final String location;
    private boolean isOn;
    private SpeedStatus speedStatus;

    public CeilingFan(String location) {
        this.location = location;
        this.isOn = false;
    }

    public void on() {
        isOn = true;
        speedStatus = SpeedStatus.LOW;
        System.out.println(this);
    }

    public void off() {
        isOn = false;
        System.out.println(this);
    }

    public void high() {
        if (isOn) {
            speedStatus = SpeedStatus.HIGH;
        }
    }

    public void medium() {
        if (isOn) {
            speedStatus = SpeedStatus.MEDIUM;
        }
    }

    public void low() {
        if (isOn) {
            speedStatus = SpeedStatus.LOW;
        }
    }

    public SpeedStatus getSpeedStatus() {
        return speedStatus;
    }

    @Override
    public String toString() {
        return "CeilingFan{" +
                "location='" + location + '\'' +
                ", isOn=" + isOn +
                ", speedStatus=" + speedStatus +
                '}';
    }
}
