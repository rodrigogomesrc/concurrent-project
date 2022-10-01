package com.concurrent.project;

import com.concurrent.project.service.HttpRequests;

public class Main {
    public static void main(String[] args) {

        String testRequest = HttpRequests.getString("/test.json");
        System.out.println(testRequest);

    }
}