package com.company.solid.dip.solution;

class Main {

  public static void main(String[] args) {
    IConnection connection = new MySQLConnection().connect();

    TestDataManager testDataManager = new TestDataManager(connection);

    testDataManager.doSomething();
  }
}
