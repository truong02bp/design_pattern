package factory.store;

import factory.pizza.Pizza;
import factory.PizzaConstants;
import factory.pizza.VNCheesePizza;
import factory.pizza.VNClamPizza;
import factory.pizza.VNPepperoniPizza;
import factory.pizza.VNVeggiePizza;

public class VNPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        switch (type){
            case PizzaConstants.CHEESE:
                return new VNCheesePizza();
            case PizzaConstants.CLAM:
                return new VNClamPizza();
            case PizzaConstants.PEPPERONI:
                return new VNPepperoniPizza();
            case PizzaConstants.VEGGIE:
                return new VNVeggiePizza();
            default:
                return null;
        }
    }

}
