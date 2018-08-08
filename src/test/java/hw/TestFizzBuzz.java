 package hw;

import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestFizzBuzz {

    private FizzBuzz fixture;

//    @before
    public void setUp() throws Exception {
        fixture = new FizzBuzz();
    }

//    @After
    public void tearDown() throws Exception {
        fixture = null;
    }


    List<String> actual = Arrays.asList("This need to be an positive integer > 0");

    @Test
    public void testNegativeTen(){
        assertEquals(actual, fixture.fizzBuzzList(-10));
    }

    @Test
    public void testNegativeOne(){
        assertEquals(actual, fixture.fizzBuzzList(-1));
    }

    @Test
    public void testZero(){
        assertEquals(actual, fixture.fizzBuzzList(0));
    }


   @Test
    public void testPositiveOne(){
       List<String> output = Arrays.asList("1");
       assertEquals(output, fixture.fizzBuzzList(1));
            }

    @Test
    public void testPositiveSeven(){
        List<String> output = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7");
        assertEquals(output, fixture.fizzBuzzList(7));
    }

    @Test
    public void testPositiveSeventeen(){
        List<String> output = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
        "13", "14", "Fizz Buzz", "16", "17");
        assertEquals(output, fixture.fizzBuzzList(17));
    }
}
