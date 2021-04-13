package com.company.strategy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterStrategy implements WriterStrategy {

    private final String fileName;

    public FileWriterStrategy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.append(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
