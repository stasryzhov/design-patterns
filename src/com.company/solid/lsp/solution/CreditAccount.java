package com.company.solid.lsp.solution;

public class CreditAccount extends AbstractCurrentAccount {

  public static final double WITHDRAWAL_FEE = .99;

  public CreditAccount() {
    this.description = "Credit Account";
  }

  @Override
  public void withdraw(double amount) {
    super.withdraw(amount + WITHDRAWAL_FEE);
  }
}
