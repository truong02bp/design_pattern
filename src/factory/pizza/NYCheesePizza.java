package factory.pizza;

import factory.Pizza;

public class NYCheesePizza extends Pizza {

    @Override
    protected void prepare() {
        System.out.println("NYCheesePizza prepare.....");
    }

    @Override
    protected void bake() {
        System.out.println("NYCheesePizza bake......");
    }

    @Override
    protected void cut() {
        System.out.println("NYCheesePizza cut.....");
    }

    @Override
    protected void box() {
        System.out.println("NYCheesePizza box......");
    }
}
