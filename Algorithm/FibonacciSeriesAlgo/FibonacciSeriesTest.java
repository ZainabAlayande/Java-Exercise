package Algorithm.FibonacciSeriesAlgo;

import Algorithm.FibonacciSeries;
import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertEquals;

class FibonacciSeriesTest {


    @Test
    public void test10_FibonacciSeriesEquals88() {
        long result = 88;
        assertEquals(result, FibonacciSeries.getSumOfFibonacci(10));
    }

    @Test public void test5_FibonacciSeriesEquals88() {
        long result = 7;
        assertEquals(result, FibonacciSeries.getSumOfFibonacci(5));
    }

    @Test public void test20_FibonacciSeriesEquals88() {
        long result = 10945;
        assertEquals(result, FibonacciSeries.getSumOfFibonacci(20));
    }
}