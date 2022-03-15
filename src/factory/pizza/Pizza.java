package factory.pizza;

public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}
