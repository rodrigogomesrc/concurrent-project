package com.concurrent.project;

import java.util.Scanner;

import com.concurrent.project.model.ConcurrentExperiment;
import com.concurrent.project.model.ExperimentResult;
import com.concurrent.project.service.CSVService;

public class Main {
    public static void main(String[] args) {

        ConcurrentExperiment concurrent = new ConcurrentExperiment();
        CSVService.initCSV();
        
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número de execuções (concorrente): ");
            int executions = scanner.nextInt();
            System.out.println("Executando...");
            ExperimentResult result = concurrent.runExperiment(executions);
            CSVService.saveResult(result);
            System.out.println("Experimento finalizado!");

            System.out.println("Digite 1 para continuar os experimentos ou qualquer outra coisa pra sair: ");
            String option = scanner.next();
            if (!option.equals("1")) {
                break;
            }
            scanner.close();
        }

    }
}