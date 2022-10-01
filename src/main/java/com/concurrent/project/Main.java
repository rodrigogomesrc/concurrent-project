package com.concurrent.project;

import com.concurrent.project.model.ExperimentResult;
import com.concurrent.project.model.SequencialExperiment;
import com.concurrent.project.service.RequestsService;

public class Main {
    public static void main(String[] args) {

        String testRequest = RequestsService.getString("/test.json");
        System.out.println(testRequest);

        SequencialExperiment sequential = new SequencialExperiment();
        ExperimentResult result = sequential.runExperiment(10);

        System.out.println(result);

    }
}