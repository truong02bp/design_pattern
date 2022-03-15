package factory.pizza;

public class VNVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("VNVeggiePizza prepare.....");
    }

    @Override
    public void bake() {
        System.out.println("VNVeggiePizza bake......");
    }

    @Override
    public void cut() {
        System.out.println("VNVeggiePizza cut.....");
    }

    @Override
    public void box() {
        System.out.println("VNVeggiePizza box......");
    }
}
