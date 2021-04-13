package com.company.strategy;

public class Writer {

    public String name;
    public WriterStrategy writerStrategy;

    public void write(String content) {
        writerStrategy.write(content);
    }

    public void setWriterStrategy(WriterStrategy writerStrategy) {
        this.writerStrategy = writerStrategy;
    }
}
