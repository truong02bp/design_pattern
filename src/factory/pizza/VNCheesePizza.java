package factory.pizza;

public class VNCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("VNCheesePizza prepare.....");
    }

    @Override
    public void bake() {
        System.out.println("VNCheesePizza bake......");
    }

    @Override
    public void cut() {
        System.out.println("VNCheesePizza cut.....");
    }

    @Override
    public void box() {
        System.out.println("VNCheesePizza box......");
    }
}
