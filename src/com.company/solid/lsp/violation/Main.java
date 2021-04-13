package com.company.solid.lsp.violation;


public class Main {

  public static void main(String[] args) {

    Account myAccount = new CreditAccount();

    myAccount.add(200);
    myAccount.withdraw(100);

    System.out.println(myAccount);
  }
}


