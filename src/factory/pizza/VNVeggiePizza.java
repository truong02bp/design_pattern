package factory.pizza;

import factory.Pizza;

public class VNVeggiePizza extends Pizza {
    @Override
    protected void prepare() {
        System.out.println("VNVeggiePizza prepare.....");
    }

    @Override
    protected void bake() {
        System.out.println("VNVeggiePizza bake......");
    }

    @Override
    protected void cut() {
        System.out.println("VNVeggiePizza cut.....");
    }

    @Override
    protected void box() {
        System.out.println("VNVeggiePizza box......");
    }
}
