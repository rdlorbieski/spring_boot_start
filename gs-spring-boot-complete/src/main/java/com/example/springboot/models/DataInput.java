package com.example.springboot.models;

import java.util.List;

public class DataInput {
    private List<Double> numbers;
    
    // Construtor padrão sem argumentos
    public DataInput() {
    }
    
	public DataInput(List<Double> numbers) {
		this.numbers = numbers;
	}

	public List<Double> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Double> numbers) {
		this.numbers = numbers;
	}
    
    
}
