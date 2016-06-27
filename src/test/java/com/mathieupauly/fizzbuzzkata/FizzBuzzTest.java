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

    @Test
    public void five() {
        assertEquals("Buzz", fizzBuzz(5));
    }

    @Test
    public void fifteen() {
        assertEquals("FizzBuzz", fizzBuzz(15));
    }

    private String fizzBuzz(int n) {
        String text = "";
        boolean replace = false;

        if (n % 3 == 0) {
            text = "Fizz";
            replace = true;
        }

        if (n % 5 == 0) {
            text += "Buzz";
            replace = true;
        }

        if (!replace) {
            text = "1";
        }

        return text;
    }


}
