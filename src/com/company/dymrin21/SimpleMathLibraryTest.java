package com.company.dymrin21;

import org.junit.Test;

public class SimpleMathLibraryTest {
    private double a = 54;
    private double b = 30;
    private SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();

    @Test
    public void testOne() {
        simpleMathLibrary.add(a, b);
        if (simpleMathLibrary.getSumResult() == 84) {
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @Test
    public void testTwo() {
        simpleMathLibrary.minus(a, b);
        if (simpleMathLibrary.getMinusResult() == 24) {
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }
}
