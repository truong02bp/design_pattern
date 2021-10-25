package factory.pizza;

import factory.Pizza;

public class NYPepperoniPizza extends Pizza {
    @Override
    protected void prepare() {
        System.out.println("NYPepperoniPizza prepare.....");
    }

    @Override
    protected void bake() {
        System.out.println("NYPepperoniPizza bake......");
    }

    @Override
    protected void cut() {
        System.out.println("NYPepperoniPizza cut.....");
    }

    @Override
    protected void box() {
        System.out.println("NYPepperoniPizza box......");
    }
}
