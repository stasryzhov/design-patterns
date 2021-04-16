package com.company.solid.dip.solution;

class MySQLConnection implements IConnection {

  @Override
  public MySQLConnection connect() {
    System.out.println("Connected to MySQL");
    return this;
  }
}
