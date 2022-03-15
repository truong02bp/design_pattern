package factory.ingredients;

import factory.ingredients.cheese.Cheese;
import factory.ingredients.clams.Clams;
import factory.ingredients.dough.Dough;
import factory.ingredients.pepperoni.Pepperoni;
import factory.ingredients.sauce.Sauce;
import factory.ingredients.veggie.Veggie;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClams();
    Pepperoni createPepperoni();
    Veggie[] createVeggies();

}
