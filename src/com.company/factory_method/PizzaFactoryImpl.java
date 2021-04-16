package factory_method;

public class PizzaFactoryImpl implements PizzaFactory {

    @Override
    public Pizza createPizza(String pizzaName) {
        return PizzaType.valueOf(pizzaName.toUpperCase()).getInstance();
    }
}
