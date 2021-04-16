package com.company.solid.dip.solution;

class PostgresConnection implements IConnection {

  @Override
  public IConnection connect() {
    System.out.println("Connected to PostgreSQL");
    return this;
  }
}
