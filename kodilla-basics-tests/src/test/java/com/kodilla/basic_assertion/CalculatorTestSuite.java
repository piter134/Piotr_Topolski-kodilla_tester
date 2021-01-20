package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.addition(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        int subtractionResult = calculator.subtraction(a, b);
        assertEquals(5, subtractionResult);
    }
    @Test
    public void testSquared() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = -1;
        int c = 0;
        int squaredResultA = calculator.squared(a);
        int squaredResultB = calculator.squared(b);
        int squaredResultC = calculator.squared(c);
        assertEquals(25, squaredResultA);
        assertEquals(1, squaredResultB);
        assertEquals(0, squaredResultC);
    }
}
