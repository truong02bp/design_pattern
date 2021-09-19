package decorators;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        cost = 30;
        description = "Dark roast";
    }

    @Override
    public double cost() {
        return cost;
    }
}
