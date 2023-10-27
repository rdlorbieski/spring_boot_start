package com.example.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springboot.models.DataInput;
import com.example.springboot.models.StatisticsResult;

@Service
public class StatisticsService {

    public StatisticsResult calculateStatistics(DataInput dataInput) {
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
        return new StatisticsResult(mean, totalSum, max);
    }
}