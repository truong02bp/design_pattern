package factory.pizza;

import factory.Pizza;

public class NYClamPizza extends Pizza {
    @Override
    protected void prepare() {
        System.out.println("NYClamPizza prepare.....");
    }

    @Override
    protected void bake() {
        System.out.println("NYClamPizza bake......");
    }

    @Override
    protected void cut() {
        System.out.println("NYClamPizza cut.....");
    }

    @Override
    protected void box() {
        System.out.println("NYClamPizza box......");
    }
}
