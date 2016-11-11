/*
 * Copyright (c) 2016 Brian Scott Russell  All Rights Reserved.
 * The source code is owned by Brian Scott Russell and is protected by copyright
 * laws and international copyright treaties, as well as other intellectual
 * property laws and treaties.
 */

import com.brianscottrussell.fizzbuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for FizzBuzz solution
 *
 * @author brussell
 */
public class FizzBuzzTest {

    @Test
    public void testWhenDivisibleByThree() {
        Assert.assertEquals("Fizz", FizzBuzz.fizzBuzzNumber(3));
    }

    @Test
    public void testWhenDivisibleByFive() {
        Assert.assertEquals("Buzz", FizzBuzz.fizzBuzzNumber(5));
    }

    @Test
    public void testWhenDivisibleByThreeAndFive() {
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzBuzzNumber(15));
    }

    @Test
    public void testWhenNotDivisibleByThreeOrFive() {
        Assert.assertEquals("1", FizzBuzz.fizzBuzzNumber(1));
        Assert.assertEquals("11", FizzBuzz.fizzBuzzNumber(11));
        Assert.assertEquals("37", FizzBuzz.fizzBuzzNumber(37));
    }
}
