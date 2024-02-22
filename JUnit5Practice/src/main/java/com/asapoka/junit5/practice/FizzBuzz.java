package com.asapoka.junit5.practice;

/**
 * Hello world!
 *
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    static String fizzBuzz(int i) {
        String out = "";
        if (i % 3 == 0) {
            out += "Fizz";
        }
        if (i % 5 == 0) {
            out += "Buzz";
        }
        if (i % 3 != 0 && i % 5 != 0) {
            out += i;
        }
        return out;
    }
}
