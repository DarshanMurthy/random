package com.interview.perfection;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumContinuousTest {

    @Test
    public void continuousSum() {
        int array1[]= {1,2,3,4};
        MaximumContinuous test = new MaximumContinuous();
        assertEquals( "results",10, test.continuousSum(array1));


        int array2[] ={-1,-2,-3};
        assertEquals( "results",-1, test.continuousSum(array2));

        int array3[] ={-1,1,2,3,4,-8};
        assertEquals( "results",10, test.continuousSum(array3));

        int array4[] ={-2, -3, 4, -1, -2, 1, 5, -3};
        assertEquals( "results",7, test.continuousSum(array4));


    }
}