package factory_method;

public class Main {

    public static void main(String[] args) {
        String pizzaName = args[0];

        PizzaFactory pizzaFactory = new PizzaFactoryImpl();
        Pizza pizza = pizzaFactory.createPizza(pizzaName);
        pizza.printIngredients();
        pizza.printRecipe();
    }
}
