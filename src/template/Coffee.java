package template;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Brew the coffee grinds");
    }

    @Override
    void addCondiments() {
        System.out.println("Add sugar and milk");
    }
}
