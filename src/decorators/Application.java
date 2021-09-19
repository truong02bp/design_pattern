package decorators;

public class Application {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " : " + coffee.cost());

        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " : " + coffee.cost());

        coffee = new Mocha(coffee);
        System.out.println(coffee.getDescription() + " : " + coffee.cost());

        coffee = new Mocha(coffee);
        System.out.println(coffee.getDescription() + " : " + coffee.cost());


        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription() + " : " + darkRoast.cost());

        darkRoast = new Milk(darkRoast);
        System.out.println(darkRoast.getDescription() + " : " + darkRoast.cost());

        darkRoast = new Milk(darkRoast);
        System.out.println(darkRoast.getDescription() + " : " + darkRoast.cost());

        darkRoast = new Mocha(darkRoast);
        System.out.println(darkRoast.getDescription() + " : " + darkRoast.cost());
    }
}
