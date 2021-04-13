package com.company.strategy;

public class ConsoleWriterStrategy implements WriterStrategy {

    @Override
    public void write(String content) {
        System.out.println(content);
    }
}
