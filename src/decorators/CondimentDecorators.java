package decorators;

public abstract class CondimentDecorators extends Beverage {
    protected Beverage beverage;

    public abstract String getDescription();
}
