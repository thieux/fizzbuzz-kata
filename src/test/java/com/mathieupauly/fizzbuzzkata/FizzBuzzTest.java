package com.mathieupauly.fizzbuzzkata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private static final String EXPECTED = "1\n" +
            "2\n" +
            "Fizz\n" +
            "4\n" +
            "Buzz\n" +
            "Fizz\n" +
            "7\n" +
            "8\n" +
            "Fizz\n" +
            "Buzz\n" +
            "11\n" +
            "Fizz\n" +
            "13\n" +
            "14\n" +
            "FizzBuzz\n" +
            "16\n" +
            "17\n" +
            "Fizz\n" +
            "19\n" +
            "Buzz\n" +
            "Fizz\n" +
            "22\n" +
            "23\n" +
            "Fizz\n" +
            "Buzz\n" +
            "26\n" +
            "Fizz\n" +
            "28\n" +
            "29\n" +
            "FizzBuzz\n" +
            "31\n" +
            "32\n" +
            "Fizz\n" +
            "34\n" +
            "Buzz\n" +
            "Fizz\n" +
            "37\n" +
            "38\n" +
            "Fizz\n" +
            "Buzz\n" +
            "41\n" +
            "Fizz\n" +
            "43\n" +
            "44\n" +
            "FizzBuzz\n" +
            "46\n" +
            "47\n" +
            "Fizz\n" +
            "49\n" +
            "Buzz\n" +
            "Fizz\n" +
            "52\n" +
            "53\n" +
            "Fizz\n" +
            "Buzz\n" +
            "56\n" +
            "Fizz\n" +
            "58\n" +
            "59\n" +
            "FizzBuzz\n" +
            "61\n" +
            "62\n" +
            "Fizz\n" +
            "64\n" +
            "Buzz\n" +
            "Fizz\n" +
            "67\n" +
            "68\n" +
            "Fizz\n" +
            "Buzz\n" +
            "71\n" +
            "Fizz\n" +
            "73\n" +
            "74\n" +
            "FizzBuzz\n" +
            "76\n" +
            "77\n" +
            "Fizz\n" +
            "79\n" +
            "Buzz\n" +
            "Fizz\n" +
            "82\n" +
            "83\n" +
            "Fizz\n" +
            "Buzz\n" +
            "86\n" +
            "Fizz\n" +
            "88\n" +
            "89\n" +
            "FizzBuzz\n" +
            "91\n" +
            "92\n" +
            "Fizz\n" +
            "94\n" +
            "Buzz\n" +
            "Fizz\n" +
            "97\n" +
            "98\n" +
            "Fizz\n" +
            "Buzz\n";

    @Test
    public void one() {
        assertEquals("1", fizzBuzz(1));
    }

    @Test
    public void two() {
        assertEquals("2", fizzBuzz(2));
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

    @Test
    public void show_1_100_modulo() {
        String actual = listFizzBuzz(100);

        assertEquals(EXPECTED, actual);
    }

    @Test
    public void show_1_100_for() {
        String actual = listFizzBuzzFor(100);

        assertEquals(EXPECTED, actual);
    }

    /**
     * Execution time: ~1ms
     */
    @Test
    public void benchmark_modulo() {
        listFizzBuzz(100000);
    }

    /**
     * Execution time: ~50ms
     */
    @Test
    public void benchmark_for() {
        listFizzBuzzFor(100000);
    }

    private String listFizzBuzzFor(int max) {
        String[] array = new String[max];
        for (int n = 3; n <= 100; n += 3) {
            array[n - 1] = "Fizz";
        }
        for (int n = 5; n <= 100; n += 5) {
            boolean fizz = array[n - 1] != null;
            array[n - 1] = (fizz ? array[n - 1] : "") + "Buzz";
        }

        StringBuilder buffer = new StringBuilder();
        for (int n = 1; n <= 100; n++) {
            buffer.append(array[n - 1] == null ? n : array[n - 1]);
            buffer.append("\n");
        }
        return buffer.toString();
    }

    private String listFizzBuzz(int max) {
        StringBuilder buffer = new StringBuilder();
        for (int n = 1; n <= max; n++) {
            buffer.append(fizzBuzz(n));
            buffer.append("\n");
        }
        return buffer.toString();
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
            text = String.valueOf(n);
        }

        return text;
    }


}
