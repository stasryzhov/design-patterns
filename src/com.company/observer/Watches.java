package com.company.observer;

public class Watches implements Display, Observer {

  private float temperature;
  private float humidity;
  private float pressure;

  public Watches(DataSource weatherData) {
    weatherData.registerObserver(this);
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }

  @Override
  public void display() {
    System.out.printf(
            "Watches:\nTemperature: %.2f\nHumidity: %.2f\nPressure: %.2f\n\n",
            temperature, humidity, pressure);
  }
}
