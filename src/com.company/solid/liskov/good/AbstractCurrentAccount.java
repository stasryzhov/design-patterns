package com.company.solid.liskov.good;

public class AbstractCurrentAccount implements CurrentAccount {

  protected double balance;
  protected String description;

  @Override
  public void add(double amount) {
    balance += amount;
  }

  @Override
  public void withdraw(double amount) {
    balance -= amount;
  }

  @Override
  public String toString() {
    return description + ": balance=" + balance;
  }
}
