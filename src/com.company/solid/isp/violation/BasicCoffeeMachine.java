package com.company.solid.isp.violation;

public class BasicCoffeeMachine implements ICoffeeMachine {

  @Override
  public void addGroundCoffee() {
  }

  @Override
  public CoffeeDrink brewFilteredCoffee() {
    return new CoffeeDrink();
  }

  @Override
  public CoffeeDrink brewEspresso() {
    throw new UnsupportedOperationException("This machine only brews filtered coffee");
  }
}
