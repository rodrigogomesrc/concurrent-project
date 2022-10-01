package com.concurrent.project.model;

public class Execution {

    private int executions;
    private int timeMillis;
    private String category;

    public Execution(int executions, int timeMillis, String category) {
        this.executions = executions;
        this.timeMillis = timeMillis;
        this.category = category;
    }

    public int getExecutions() {
        return executions;
    }

    public void setExecutions(int executions) {
        this.executions = executions;
    }

    public int getTimeMillis() {
        return timeMillis;
    }

    public void setTimeMillis(int timeMillis) {
        this.timeMillis = timeMillis;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
