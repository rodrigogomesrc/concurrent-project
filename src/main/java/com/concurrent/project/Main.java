package com.concurrent.project;

import java.util.ArrayList;
import java.util.List;

import com.concurrent.project.model.ConcurrentExperiment;
import com.concurrent.project.model.ExperimentResult;
import com.concurrent.project.service.CSVService;

public class Main {
    public static void main(String[] args) {

        ConcurrentExperiment concurrent = new ConcurrentExperiment();
        final int multiplicator = 20;
    	int sceneryNumber = 0;
    	ArrayList<Integer> scenerys = new ArrayList<Integer>(List.of(10, 100, 500, 1000));
    	CSVService.initCSV();
    
    	
    	System.out.println("Iniciando experimentos (Concorrente)");
    	for (int i =0; i < scenerys.size(); i++) {
    		sceneryNumber++;
    		System.out.println("cenário: " + sceneryNumber + " requisições: " + scenerys.get(i));
            for (int j = 0; j < multiplicator; j++) {
            	System.out.println("Executando...");
                ExperimentResult result = concurrent.runExperiment(scenerys.get(i), sceneryNumber);
                CSVService.saveResult(result);
            }
    	}
    	System.out.println("Fim dos experimentos");

    }
}