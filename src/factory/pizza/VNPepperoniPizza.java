package factory.pizza;

import factory.Pizza;

public class VNPepperoniPizza extends Pizza {
    @Override
    protected void prepare() {
        System.out.println("VNPepperoniPizza prepare.....");
    }

    @Override
    protected void bake() {
        System.out.println("VNPepperoniPizza bake......");
    }

    @Override
    protected void cut() {
        System.out.println("VNPepperoniPizza cut.....");
    }

    @Override
    protected void box() {
        System.out.println("VNPepperoniPizza box......");
    }
}
