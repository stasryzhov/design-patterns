package factory_method;

public class Veggie implements Pizza {

    @Override
    public void printIngredients() {
        System.out.println("Some veggie stuff");
    }

    @Override
    public void printRecipe() {
        System.out.println("Bake on 200 C for 10 min");
    }
}
