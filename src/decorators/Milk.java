package decorators;

public class Milk extends CondimentDecorators {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
