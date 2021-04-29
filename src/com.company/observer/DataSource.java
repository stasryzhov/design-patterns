package com.company.observer;

public interface DataSource {

  void registerObserver(Observer observer);

  void notifyObservers();
}
