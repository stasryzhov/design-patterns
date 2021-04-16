package com.company.solid.isp.violation;

public interface ICoffeeMachine {

  CoffeeDrink brewFilteredCoffee();

  void addGroundCoffee();

  CoffeeDrink brewEspresso();
}
