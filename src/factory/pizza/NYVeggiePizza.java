package factory.pizza;

import factory.Pizza;

public class NYVeggiePizza extends Pizza {
    @Override
    protected void prepare() {
        System.out.println("NYVeggiePizza prepare.....");
    }

    @Override
    protected void bake() {
        System.out.println("NYVeggiePizza bake......");
    }

    @Override
    protected void cut() {
        System.out.println("NYVeggiePizza cut.....");
    }

    @Override
    protected void box() {
        System.out.println("NYVeggiePizza box......");
    }
}
