package com.brianscottrussell.fizzbuzz;

/*
 * Copyright (c) 2016 Brian Scott Russell  All Rights Reserved.
 * The source code is owned by Brian Scott Russell and is protected by copyright
 * laws and international copyright treaties, as well as other intellectual
 * property laws and treaties.
 * $RCSfile: $
 */

/**
 * @author brussell
 */
public class FizzBuzz {

    public static void main(String[] args) {
        runFizzBuzz();
    }

    /**
     * Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the
     *  number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five
     *  print "FizzBuzz?".
     */
    private static void runFizzBuzz() {
        for(int i=1; i<=100; i++) {
            System.out.println(doFizzBuzz(i));
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
    public static String doFizzBuzz(int number) {
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