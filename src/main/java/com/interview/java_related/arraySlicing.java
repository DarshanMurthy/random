package com.interview.java_related;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraySlicing {

    public static void main(String args[]){

        /**
         * copyOfRange basically copies
         * elements from "from" to "to-1" indexed
         * elements.
         */
        int arr[] = {12,3,4,5};
        for(int i :Arrays.copyOfRange(arr,1,3)){
            System.out.print(i);
        }
    }
}
