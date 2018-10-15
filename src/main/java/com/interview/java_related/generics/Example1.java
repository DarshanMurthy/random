package com.interview.java_related.generics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Example1 {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1,2,3);
        int sum=0;
        for(int i: list){
            sum+=i;
        }
        assert sum==5;
    }
}
