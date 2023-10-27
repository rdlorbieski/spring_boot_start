package com.example.springboot.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.models.*;

import java.util.List;

@RestController
public class StatisticsController {

    @PostMapping("/calculate-statistics")
    public StatisticsResult calculateStatistics(@RequestBody DataInput dataInput) {
        List<Double> numbers = dataInput.getNumbers();

        // Verifique se a lista de números não está vazia
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("A lista de números não pode estar vazia.");
        }

        // Calcule a média
        double sum = 0;
        for (Double number : numbers) {
            sum += number;
        }
        double mean = sum / numbers.size();

        // Calcule a soma
        double totalSum = sum;

        // Encontre o valor máximo
        double max = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .max()
                .orElseThrow(() -> new IllegalStateException("Não foi possível encontrar o valor máximo."));

        // Crie um objeto StatisticsResult com os resultados
        StatisticsResult result = new StatisticsResult(mean, totalSum, max);

        return result;
    }
}
