package decorators;

public abstract class Beverage {
    protected double cost;
    protected String description;

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
