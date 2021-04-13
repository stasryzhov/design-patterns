package com.company.solid.liskov.good;

import java.time.LocalDate;

import static java.lang.String.format;
import static java.time.LocalDate.now;

public class AbstractDepositAccount implements DepositAccount {

  protected double balance;
  protected String description;
  protected LocalDate closeDate;

  @Override
  public void add(double amount) {
    balance += amount;
  }

  @Override
  public double close() {
    if (now().isBefore(closeDate)) {
      System.out.println("To close account, you must wait until " + closeDate);
      return 0;
    }

    final double totalAmount = balance;
    balance = 0;

    return totalAmount;
  }

  @Override
  public String toString() {
    return format("%s: balance=%.2f, close date=%s", description, balance, closeDate);
  }
}
