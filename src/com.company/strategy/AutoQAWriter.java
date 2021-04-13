package com.company.strategy;

public class AutoQAWriter extends Writer {

    public AutoQAWriter(String name, WriterStrategy writerStrategy) {
        this.name = name;
        this.writerStrategy = writerStrategy;
    }
}
