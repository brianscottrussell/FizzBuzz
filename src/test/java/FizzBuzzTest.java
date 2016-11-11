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
        Assert.assertEquals("Fizz", FizzBuzz.doFizzBuzz(3));
    }

    @Test
    public void testWhenDivisibleByFive() {
        Assert.assertEquals("Buzz", FizzBuzz.doFizzBuzz(5));
    }

    @Test
    public void testWhenDivisibleByThreeAndFive() {
        Assert.assertEquals("FizzBuzz", FizzBuzz.doFizzBuzz(15));
    }

    @Test
    public void testWhenNotDivisibleByThreeOrFive() {
        Assert.assertEquals("1", FizzBuzz.doFizzBuzz(1));
        Assert.assertEquals("11", FizzBuzz.doFizzBuzz(11));
        Assert.assertEquals("37", FizzBuzz.doFizzBuzz(37));
    }
}
