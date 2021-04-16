package com.company.solid.isp.violation;

public class EspressoMachine implements ICoffeeMachine {

  public void addGroundCoffee() {
  }

  public CoffeeDrink brewFilteredCoffee() {
    throw new UnsupportedOperationException("This machine only brews espresso!");
  }

  public CoffeeDrink brewEspresso() {
    return new CoffeeDrink();
  }
}
