package com.company.solid.lsp.solution;

import static java.time.LocalDate.now;

public class FixedTermDepositAccount extends AbstractDepositAccount {

  public FixedTermDepositAccount(int months) {
    this.closeDate = now().plusMonths(months);
    this.description = "Fixed Term Deposit";
  }
}
