package com.company.observer;

public class TV implements Display, Observer {

  private float temperature;
  private float humidity;

  public TV(DataSource weatherData) {
    weatherData.registerObserver(this);
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  @Override
  public void display() {
    System.out.printf("TV:\nTemperature: %.2f\nHumidity: %.2f\n\n", temperature, humidity);
  }
}
