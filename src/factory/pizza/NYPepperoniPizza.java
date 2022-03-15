package factory.pizza;

public class NYPepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NYPepperoniPizza prepare.....");
    }

    @Override
    public void bake() {
        System.out.println("NYPepperoniPizza bake......");
    }

    @Override
    public void cut() {
        System.out.println("NYPepperoniPizza cut.....");
    }

    @Override
    public void box() {
        System.out.println("NYPepperoniPizza box......");
    }
}
