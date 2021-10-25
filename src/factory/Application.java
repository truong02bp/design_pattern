package factory;

public class Application {
    public static void main(String[] args) {
        PizzaStore pizzaStore = PizzaStore.create("VN");
        pizzaStore.orderPizza(PizzaConstants.CLAM);
    }
}
