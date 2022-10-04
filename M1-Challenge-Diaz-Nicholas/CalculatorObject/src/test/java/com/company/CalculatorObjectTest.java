package com.company;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorObjectTest {
    private static CalculatorObject calc = new CalculatorObject();

    @Test
    public void addTwoInts() {
        String failMessage = "Expected to return the sum between 2 integers.";
        assertEquals(2, calc.addTwoInts(1, 1));
    }

    @Test
    public void subtractTwoDoubles() {
        String failMessage = "Failed to enter two integers.";
//      assertEquals(failMessage, 29, calc.subtractTwoDoubles(23d, 52d));
        assertEquals(failMessage, 29, calc.subtractTwoDoubles(52d, 23d), .0001);
        assertEquals(failMessage, -29, calc.subtractTwoDoubles(23d, 52d), .0001);
//        I thought, why not? heh
    }

    @Test
    public void multiplyTwoDoubles() {
        String failMessage = "Failed to enter two integers.";
        assertEquals(failMessage, 68, calc.multiplyTwoDoubles(34, 2), .0001);
    }

    @Test
    public void divideTwoInts() {
        String failMessage = "Failed to enter two integers.";
        assertEquals(failMessage, 4, calc.divideTwoInts(12, 3));

    }

    @Test
    public void divideTwoLongs() {
        String failMessage = "Failed to enter two long numbers.";
        assertEquals(failMessage, 1., calc.divideTwoLongs(12, 7), .0001);
    }

    @Test
    public void addTwoFloatNumbers() {
        String failMessage = "Failed to enter two long numbers.";
        assertEquals(failMessage, 5.5f, calc.addTwoFloatNumbers(3.4f, 2.3f), 1);
    }
// 6.7 * 4.4
    @Test
    public void multiplyTwoFloats() {
        String failMessage = "Failed to enter two float numbers.";
        assertEquals(failMessage, 11.1f, calc.multiplyTwoFloats(6.7f, 4.4f), 1);
    }
// 5.5 - 0.5
    @Test
    public void subtractTwoFloats() {
        String failMessage = "Failed to enter two float numbers.";
        assertEquals(failMessage, 6.0f, calc.subtractTwoFloats(5.5f, 0.5f), 1);
    }

// 10.8/2.2
    @Test
    public void divideTwoFloats() {
        String failMessage = "Failed to enter two float numbers.";
        assertEquals(failMessage, 13f, calc.divideTwoFloats(10.8f, 2.2f), 1);
    }
}