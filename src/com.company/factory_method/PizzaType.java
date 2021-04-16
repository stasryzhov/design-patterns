package factory_method;

public enum PizzaType {
    PEPPERONI(new Pepperoni()),
    MARGHERITA(new Margherita()),
    VEGGIE(new Veggie());

    private final Pizza instance;

    PizzaType(Pizza instance) {
        this.instance = instance;
    }

    public Pizza getInstance() {
        return this.instance;
    }
}
