package factory;

import factory.store.PizzaStore;

public class Application {
    public static void main(String[] args) {
        PizzaStore pizzaStore = PizzaStore.create("VN");
        pizzaStore.orderPizza(PizzaConstants.CLAM);
    }
}
