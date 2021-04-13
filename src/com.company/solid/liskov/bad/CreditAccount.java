package com.company.solid.liskov.bad;

public class CreditAccount extends Account {

  public static final double WITHDRAWAL_FEE = .99;

  public CreditAccount() {
    this.description = "Credit Account";
  }

  @Override
  public void withdraw(double amount) {
    super.withdraw(amount + WITHDRAWAL_FEE);
  }
}
