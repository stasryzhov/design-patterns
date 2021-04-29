package com.company.observer;

public class Main {

  public static void main(String[] args) {

    WeatherData weatherData = new WeatherData();

    Display tv = new TV(weatherData);
    Display watches = new Watches(weatherData);

    weatherData.setMeasurements(25, 75);
    weatherData.setMeasurements(30, 100);
  }
}
