package factory.pizza;

public class VNPepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("VNPepperoniPizza prepare.....");
    }

    @Override
    public void bake() {
        System.out.println("VNPepperoniPizza bake......");
    }

    @Override
    public void cut() {
        System.out.println("VNPepperoniPizza cut.....");
    }

    @Override
    public void box() {
        System.out.println("VNPepperoniPizza box......");
    }
}
