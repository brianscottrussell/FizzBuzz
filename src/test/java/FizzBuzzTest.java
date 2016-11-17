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
