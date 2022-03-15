package factory.store;

import factory.pizza.Pizza;
import factory.PizzaConstants;
import factory.pizza.NYCheesePizza;
import factory.pizza.NYClamPizza;
import factory.pizza.NYPepperoniPizza;
import factory.pizza.NYVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        switch (type){
            case PizzaConstants.CHEESE:
                return new NYCheesePizza();
            case PizzaConstants.CLAM:
                return new NYClamPizza();
            case PizzaConstants.PEPPERONI:
                return new NYPepperoniPizza();
            case PizzaConstants.VEGGIE:
                return new NYVeggiePizza();
            default:
                return null;
        }
    }

}
