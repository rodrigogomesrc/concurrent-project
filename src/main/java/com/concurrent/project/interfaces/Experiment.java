package com.concurrent.project.interfaces;

import com.concurrent.project.model.ExperimentResult;

public interface Experiment {
    public ExperimentResult runExperiment(int executions);
}
