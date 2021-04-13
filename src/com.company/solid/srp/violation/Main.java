package com.company.solid.srp.violation;

public class Main {

  public static void main(String[] args) {
    Vehicle car = new Vehicle(10);
    car.accelerate();
    car.reFuel();

    System.out.println(car.getRemainingFuel());
  }
}
