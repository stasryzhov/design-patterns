package com.company.solid.dip.solution;

class TestDataManager {
  private final IConnection connection;

  public TestDataManager(IConnection connection) {
    this.connection = connection;
  }

  public void doSomething() {
    System.out.println("I do something in " + connection.getClass());
  }
}
