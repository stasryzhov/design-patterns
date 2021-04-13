package com.company.solid.liskov.good;

public class PrivateAccount extends AbstractCurrentAccount {

  public PrivateAccount() {
    this.description = "Personal Account";
  }
}
