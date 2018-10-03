package com.interview.revisions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class water {
    public static void main(String args[]){
        int arr [ ] ={1,2,3,4};
        int temp[ ] = Arrays.copyOfRange(arr,1,3);
        Arrays.sort(arr);
        for( int i: temp){
            System.out.println(i);
        }

    }
}
