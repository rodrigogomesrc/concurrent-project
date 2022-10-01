package com.concurrent.project;

import com.concurrent.project.model.ConcurrentExperiment;
import com.concurrent.project.model.ExperimentResult;
import com.concurrent.project.model.SequentialExperiment;

public class Main {
    public static void main(String[] args) {

        SequentialExperiment sequential = new SequentialExperiment();
        ConcurrentExperiment concurrent = new ConcurrentExperiment();
        //ExperimentResult result = sequential.runExperiment(10);
        ExperimentResult result = concurrent.runExperiment(10);

        System.out.println(result);

    }
}