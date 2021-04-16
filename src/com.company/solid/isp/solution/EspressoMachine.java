package com.company.solid.isp.solution;

public class EspressoMachine implements IEspressoCoffeeMachine {

  public void addGroundCoffee() {
    System.out.println("adding ground coffee");
  }

  public CoffeeDrink brewEspresso() {
    return new CoffeeDrink();
  }
}
