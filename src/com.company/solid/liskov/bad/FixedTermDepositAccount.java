package com.company.solid.liskov.bad;

public class FixedTermDepositAccount extends Account {

  public FixedTermDepositAccount() {
    this.description = "Fixed Term Deposit Account";
  }

  @Override
  public void withdraw(double amount) {
    throw new UnsupportedOperationException("Sorry mate, you can't get your money back now");
  }
}
