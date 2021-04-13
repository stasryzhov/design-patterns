package com.company.solid.liskov.good;

public interface CurrentAccount extends Account {

  void withdraw(double amount);
}
