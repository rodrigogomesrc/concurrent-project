package com.concurrent.project;

import com.concurrent.project.util.Requests;

public class Main {
    public static void main(String[] args) {

        String testRequest = Requests.getString("/test.json");
        System.out.println(testRequest);

    }
}