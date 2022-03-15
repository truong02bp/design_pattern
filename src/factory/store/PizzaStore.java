package factory.store;

import factory.pizza.Pizza;

public abstract class PizzaStore {

    public static PizzaStore create(String choice) {
        if (choice.equals("VN"))
            return new VNPizzaStore();
        return new NYPizzaStore();
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
