package factory_method;

public class Pepperoni implements Pizza{

    @Override
    public void printIngredients() {
        System.out.println("Pepperoni, cheese, herbs");
    }

    @Override
    public void printRecipe() {
        System.out.println("Bake on 220 C for 15 min");
    }
}
