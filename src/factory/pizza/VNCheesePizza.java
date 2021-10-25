package factory.pizza;

import factory.Pizza;

public class VNCheesePizza extends Pizza {
    @Override
    protected void prepare() {
        System.out.println("VNCheesePizza prepare.....");
    }

    @Override
    protected void bake() {
        System.out.println("VNCheesePizza bake......");
    }

    @Override
    protected void cut() {
        System.out.println("VNCheesePizza cut.....");
    }

    @Override
    protected void box() {
        System.out.println("VNCheesePizza box......");
    }
}
