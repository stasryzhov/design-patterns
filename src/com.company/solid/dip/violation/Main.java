package com.company.solid.dip.violation;

class Main {

    public static void main(String[] args) {

        MySQLConnection connection = new MySQLConnection().connect();
        TestDataManager testDataManager = new TestDataManager(connection);

        testDataManager.doSomething();
    }
}
