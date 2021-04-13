package com.company.solid.srp.solution;

public class GasStation {

  public void refuel(Vehicle vehicle) {
    int remainingFuel = vehicle.getRemainingFuel();
    int fuelToAdd = vehicle.getMaxFuel() - remainingFuel;

    vehicle.setRemainingFuel(remainingFuel + fuelToAdd);
  }
}
