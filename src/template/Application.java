package template;

public class Application {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
        Tea tea = new Tea();
        coffee.prepareRecipe();
    }
}
