package com.company.solid.srp.solution;

public class Vehicle {

  private final int maxFuel;
  private int remainingFuel;

  public Vehicle(int maxFuel) {
    this.maxFuel = maxFuel;
    this.remainingFuel = maxFuel;
  }

  public int getMaxFuel() {
    return maxFuel;
  }

  public int getRemainingFuel() {
    return remainingFuel;
  }

  public void setRemainingFuel(int remainingFuel) {
    this.remainingFuel = remainingFuel;
  }

  public void accelerate() {
    this.remainingFuel--;
  }
}
