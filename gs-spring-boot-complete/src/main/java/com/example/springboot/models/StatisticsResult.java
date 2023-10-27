package com.example.springboot.models;

public class StatisticsResult {
	
	private double mean;
    private double totalSum;
    private double max;

    public StatisticsResult(double mean, double totalSum, double max) {
        this.mean = mean;
        this.totalSum = totalSum;
        this.max = max;
    }

	public double getMean() {
		return mean;
	}

	public void setMean(double mean) {
		this.mean = mean;
	}

	public double getTotalSum() {
		return totalSum;
	}

	public void setTotalSum(double totalSum) {
		this.totalSum = totalSum;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}
    
    

}
