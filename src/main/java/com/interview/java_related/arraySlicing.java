package com.interview.java_related;

import java.util.Arrays;

public class arraySlicing {

    public static void main(String args[]){

        /**
         * Don't include the last element :)
         */
        int arr[] = {12,3,4,5};
        for(int i :Arrays.copyOfRange(arr,1,3)){
            System.out.print(i);
        }

        int arr2[] = {1,2,3,4};
        for( int i : Arrays.copyOfRange(arr2,0,1)){
            System.out.println(i);
        }

    }
}
