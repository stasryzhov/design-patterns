package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements DataSource {

  private final List<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void notifyObservers() {
    this.observers.forEach(observer -> observer.update(temperature, humidity, pressure));
  }

  @Override
  public void registerObserver(Observer observer) {
    this.observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void setMeasurements(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    notifyObservers();
  }
}
