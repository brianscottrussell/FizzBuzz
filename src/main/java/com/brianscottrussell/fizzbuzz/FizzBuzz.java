package com.brianscottrussell.fizzbuzz;

/*
 * Copyright (c) 2016 Brian Scott Russell
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/**
 * This program is a rendering of Stage 1 of the FizzBuzz Kata found here:
 *  http://codingdojo.org/cgi-bin/index.pl?KataFizzBuzz
 *
 * Summary
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the
 *  number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five
 *  print "FizzBuzz?".
 *
 * @author brussell
 */
public class FizzBuzz {

    public static void main(String[] args) {
        // We're going to count to 100 for this game
        runFizzBuzz(100);
    }

    /**
     * Simply runs the FizzBuzz routine starting at 1 and ending at totalCount
     *
     * @param totalCount the number we will be counting up to
     */
    private static void runFizzBuzz(int totalCount) {
        if(totalCount <= 0) {
            System.out.println("We need at least one participant to play FizzBuzz!");
        }
        for (int i = 1; i <= totalCount; i++) {
            System.out.println(fizzBuzzNumber(i));
        }
    }

    /**
     * Method returns the string representation of the input number according to FizzBuzz rules
     *
     *   FizzBuzz Rules:
     *    - for multiples of three return "Fizz" instead of the number
     *    - for the multiples of five return "Buzz" instead of the number
     *    - for numbers which are multiples of both three and five, return "FizzBuzz", instead of the number
     *    - otherwise return the number
     *
     * @param number int as the number to which to apply FizzBuzz rules
     * @return String as the representation of the number according to FizzBuzz rules
     */
    public static String fizzBuzzNumber(int number) {
        if(number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        else if(number % 3 == 0) {
            return "Fizz";
        }
        else if(number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}