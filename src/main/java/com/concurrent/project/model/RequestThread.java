package com.concurrent.project.model;

import com.concurrent.project.service.RequestsService;

public class RequestThread extends Thread {

    private String url;
    private int threadNumber;

    public RequestThread() {
        super();
    }

    public RequestThread(String url, int threadNumber) {
        this.url = url;
        this.threadNumber = threadNumber;

    }

    @Override
    public void run() {
        String data = RequestsService.getString(url);
        System.out.println("Thread number: " + threadNumber);
        System.out.println(data);
    }
}
