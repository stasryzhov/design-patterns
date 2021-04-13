package com.company.solid.lsp.solution;

public class Main {

  public static void main(String[] args) {

    DepositAccount myAccount = new FixedTermDepositAccount(12);

    myAccount.add(200);
    myAccount.close();

    System.out.println(myAccount);
  }
}
