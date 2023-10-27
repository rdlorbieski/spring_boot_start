package com.example.springboot;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.springboot.models.DataInput;
import com.example.springboot.models.StatisticsResult;
import com.example.springboot.services.StatisticsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

@SpringBootTest
public class StatisticsServiceTest {

    @Autowired
    private StatisticsService statisticsService;

    @Test
    public void testCalculateStatistics() {
        DataInput dataInput = new DataInput(Arrays.asList(1.0, 2.0, 3.0));
        StatisticsResult result = statisticsService.calculateStatistics(dataInput);

        // Realize as asserções de teste com base nos valores esperados
        assertEquals(2.0, result.getMean(), 0.01); // 2 casas decimais de precisão
        assertEquals(6.0, result.getTotalSum(), 0.01);
        assertEquals(3.0, result.getMax(), 0.01);
    }
}