package command.receiver;

public class Door {

    private final String location;
    private boolean isOpen;

    public Door(String location) {
        this.location = location;
        this.isOpen = false;
    }

    public void open(){
        isOpen = true;
        System.out.println(this);
    }

    public void close(){
        isOpen = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Door{" +
                "location='" + location + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}
