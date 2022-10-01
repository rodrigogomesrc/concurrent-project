package com.concurrent.project.model;

import com.concurrent.project.interfaces.Experiment;
import com.concurrent.project.service.RequestsService;

public class SequencialExperiment implements Experiment {

    @Override
    public ExperimentResult runExperiment(int executions) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < executions; i++) {
            RequestsService.getString("/test.json");
        }
        long endTime = System.currentTimeMillis();
        long timeMillis = endTime - startTime;
        return new ExperimentResult(executions, timeMillis, "sequencial");
    }
}

