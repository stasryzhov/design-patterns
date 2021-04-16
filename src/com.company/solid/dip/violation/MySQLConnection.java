package com.company.solid.dip.violation;

class MySQLConnection {

    public MySQLConnection connect() {
        System.out.println("Connected to MySQL");
        return this;
    }
}
