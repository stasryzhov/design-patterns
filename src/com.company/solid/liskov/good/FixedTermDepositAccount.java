package com.company.solid.liskov.good;

import static java.time.LocalDate.now;

public class FixedTermDepositAccount extends AbstractDepositAccount {

  public FixedTermDepositAccount(int months) {
    this.closeDate = now().plusMonths(months);
    this.description = "Fixed Term Deposit";
  }
}
