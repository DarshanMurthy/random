package com.interview.java_related;

import java.util.Arrays;

public class arraySlicing {

    public static void main(String args[]){
        int arr[] = {12,3,4,5};
        for(int i :Arrays.copyOfRange(arr,1,3)){
            System.out.print(i);
        }

    }
}
