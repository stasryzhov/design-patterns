package factory_method;

public class Margherita implements Pizza {

    @Override
    public void printIngredients() {
        System.out.println("Cheese, tomato");
    }

    @Override
    public void printRecipe() {
        System.out.println("Bake on 180 C for 12 min");
    }
}
