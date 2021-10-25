package factory.pizza;

import factory.Pizza;

public class VNClamPizza extends Pizza {
    @Override
    protected void prepare() {
        System.out.println("VNClamPizza prepare.....");
    }

    @Override
    protected void bake() {
        System.out.println("VNClamPizza bake......");
    }

    @Override
    protected void cut() {
        System.out.println("VNClamPizza cut.....");
    }

    @Override
    protected void box() {
        System.out.println("VNClamPizza box......");
    }
}
