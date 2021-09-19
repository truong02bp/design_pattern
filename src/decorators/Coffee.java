package decorators;

public class Coffee extends Beverage {
    public Coffee() {
        cost = 20;
        description = "Coffee";
    }

    @Override
    public double cost() {
        return cost;
    }
}
