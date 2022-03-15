package factory.pizza;

public class VNClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("VNClamPizza prepare.....");
    }

    @Override
    public void bake() {
        System.out.println("VNClamPizza bake......");
    }

    @Override
    public void cut() {
        System.out.println("VNClamPizza cut.....");
    }

    @Override
    public void box() {
        System.out.println("VNClamPizza box......");
    }
}
