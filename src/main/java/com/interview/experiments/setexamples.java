package com.interview.experiments;

import java.lang.reflect.Array;
import java.util.*;

public class setexamples {


    public static void main(String args[]){
        Set<String> set = new HashSet<>();
        set.add("node1");
        set.add("node2");
        set.add("node3");
        set.add("node1");

        for(String str: set){
            System.out.println(str);
        }

        int arr[] = {1,2,3,4};
        int temp [] = Arrays.copyOfRange(arr, 0,2);
        for(int i: temp){
            System.out.println(i);
        }

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);


        for( int i: list1){
            System.out.println(i);
        }




    }
}
