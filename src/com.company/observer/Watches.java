package com.company.observer;

public class Watches implements Display, Observer {

  private float temperature;

  public Watches(DataSource weatherData) {
    weatherData.registerObserver(this);
  }

  @Override
  public void update(float temperature, float humidity) {
    this.temperature = temperature;
    display();
  }

  @Override
  public void display() {
    System.out.printf("Watches:\nTemperature: %.2f\n\n", temperature);
  }
}
