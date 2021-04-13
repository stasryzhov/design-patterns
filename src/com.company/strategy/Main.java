package com.company.strategy;

public class Main {

    public static void main(String[] args) {
        Writer writer = new AutoQAWriter("Bill Gates", new FileWriterStrategy("test-name"));
        writer.write("writing to the file");

        writer.setWriterStrategy(new ConsoleWriterStrategy());
        writer.write("console story");
    }
}
