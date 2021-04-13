package com.company.solid.liskov.good;

public class Main {

  public static void main(String[] args) {

    DepositAccount myAccount = new FixedTermDepositAccount(12);

    myAccount.add(200);
    myAccount.close();

    System.out.println(myAccount);
  }
}
