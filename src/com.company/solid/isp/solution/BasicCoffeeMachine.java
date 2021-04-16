package com.company.solid.isp.solution;

public class BasicCoffeeMachine implements IBasicCoffeeMachine {

  @Override
  public CoffeeDrink brewFilteredCoffee() {
    return new CoffeeDrink();
  }

  @Override
  public void addGroundCoffee() {
    System.out.println("adding ground coffee");
  }
}
