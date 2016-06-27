package com.mathieupauly.fizzbuzzkata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void one() {
        assertEquals("1", fizzBuzz(1));
    }

    @Test
    public void three() {
        assertEquals("Fizz", fizzBuzz(3));
    }

    private String fizzBuzz(int n) {
        if (n % 3 == 0) {
            return "Fizz";
        }
        return "1";
    }


}
