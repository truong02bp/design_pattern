package factory.pizza;

public class NYClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NYClamPizza prepare.....");
    }

    @Override
    public void bake() {
        System.out.println("NYClamPizza bake......");
    }

    @Override
    public void cut() {
        System.out.println("NYClamPizza cut.....");
    }

    @Override
    public void box() {
        System.out.println("NYClamPizza box......");
    }
}
