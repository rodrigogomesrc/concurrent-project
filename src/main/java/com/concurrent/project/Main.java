package com.concurrent.project;

import com.concurrent.project.model.ConcurrentExperiment;
import com.concurrent.project.model.ExperimentResult;

public class Main {
    public static void main(String[] args) {

        ConcurrentExperiment concurrent = new ConcurrentExperiment();
        ExperimentResult result = concurrent.runExperiment(10);

        System.out.println(result);

    }
}