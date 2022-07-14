package template;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steep tea baf in water");
    }

    @Override
    void addCondiments() {
        System.out.println("Add lemon");
    }
}
