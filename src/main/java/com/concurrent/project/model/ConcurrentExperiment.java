package com.concurrent.project.model;

public class ConcurrentExperiment extends RequestThread {

    public ExperimentResult runExperiment(int executions) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < executions; i++) {
            RequestThread requestThread = new RequestThread("/test.json", i);
            requestThread.start();
            try {
                requestThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        long endTime = System.currentTimeMillis();
        long timeMillis = endTime - startTime;
        return new ExperimentResult(executions, timeMillis, "concurrent");
    }
}
