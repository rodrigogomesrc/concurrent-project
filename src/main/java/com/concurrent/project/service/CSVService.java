package com.concurrent.project.service;

import com.concurrent.project.model.Execution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CSVService {

    private static final String filename = "./data/results.csv";

    private static void createFile() {
        try {
            Files.createFile(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void checkFile() {
        if (!Files.exists(Paths.get(filename))) {
            createFile();
        }
    }

    private static void appendToCSV(String line) {
        try {
            Files.write(Paths.get(filename), line.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveResult(Execution execution) {
        String line = execution.getExecutions() + "," + execution.getTimeMillis() + "," + execution.getCategory() + "\n";
        appendToCSV(line);
    }

    public static void initCSV() {
        checkFile();
        String line = "Executions,TimeMillis,Category\n";
        appendToCSV(line);
    }
}
