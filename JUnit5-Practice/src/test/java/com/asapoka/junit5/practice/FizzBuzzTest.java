package com.asapoka.junit5.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    // 15の倍数のときはFizzBuzzを返す
    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(45));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(60));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(75));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(90));

    }

    // 3の倍数のときはFizzを返す
    @Test
    void testFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(12));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(18));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(21));

    }

    // 5の倍数のときはBuzzを返す
    @Test
    void testBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(20));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(25));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(35));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(40));

    }

    // 3の倍数でも5の倍数でないときは数値をそのまま帰す
    @Test
    void testNumber() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("4", FizzBuzz.fizzBuzz(4));
        assertEquals("7", FizzBuzz.fizzBuzz(7));
        assertEquals("8", FizzBuzz.fizzBuzz(8));
        assertEquals("11", FizzBuzz.fizzBuzz(11));
        assertEquals("13", FizzBuzz.fizzBuzz(13));
        assertEquals("14", FizzBuzz.fizzBuzz(14));

    }
}
