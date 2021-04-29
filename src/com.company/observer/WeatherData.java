package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements DataSource {

  private final List<Observer> observers;
  private float temperature;
  private float humidity;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void notifyObservers() {
    this.observers.forEach(observer -> observer.update(temperature, humidity));
  }

  @Override
  public void registerObserver(Observer observer) {
    this.observers.add(observer);
  }

  public void setMeasurements(float temp, float humidity) {
    this.temperature = temp;
    this.humidity = humidity;
    notifyObservers();
  }
}
