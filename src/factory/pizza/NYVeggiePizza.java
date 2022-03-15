package factory.pizza;

public class NYVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NYVeggiePizza prepare.....");
    }

    @Override
    public void bake() {
        System.out.println("NYVeggiePizza bake......");
    }

    @Override
    public void cut() {
        System.out.println("NYVeggiePizza cut.....");
    }

    @Override
    public void box() {
        System.out.println("NYVeggiePizza box......");
    }
}
