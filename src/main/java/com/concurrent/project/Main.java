package com.concurrent.project;

import com.concurrent.project.service.RequestsService;

public class Main {
    public static void main(String[] args) {

        String testRequest = RequestsService.getString("/test.json");
        System.out.println(testRequest);

    }
}