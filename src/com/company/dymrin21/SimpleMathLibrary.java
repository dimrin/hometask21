package com.company.dymrin21;

public class SimpleMathLibrary {
    private double sumResult;
    private double minusResult;

    public double getSumResult() {
        return sumResult;
    }

    public double getMinusResult() {
        return minusResult;
    }

    public double add(double firstValue, double secondValue) {
        return sumResult = firstValue + secondValue;
    }

    public double minus(double firstValue, double secondValue) {
        return minusResult = firstValue - secondValue;
    }
}
