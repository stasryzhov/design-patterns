package com.company.solid.lsp.violation;

public abstract class Account {

  protected String description;
  private double balance;

  public void add(double amount) {
    this.balance += amount;
  }

  public void withdraw(double amount) {
    this.balance -= amount;
  }

  @Override
  public String toString() {
    return description + " : balance=" + balance;
  }
}
