package com.company.solid.srp.solution;

public class Main {

  public static void main(String[] args) {
    Vehicle car = new Vehicle(10);
    car.accelerate();

    new GasStation().refuel(car);

    System.out.println(car.getRemainingFuel());
  }
}
