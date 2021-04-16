package com.company.solid.dip.violation;

class TestDataManager {
    private final MySQLConnection connection;

    public TestDataManager(MySQLConnection connection) {
        this.connection = connection;
    }

    public void doSomething() {
        System.out.println("I do something in " + connection.getClass());
    }
}
