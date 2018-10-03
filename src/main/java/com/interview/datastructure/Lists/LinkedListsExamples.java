package com.interview.datastructure.Lists;

/*
Strengths:
 1. Fast Operation on the ends
 2. Flexible size
Weakness:
1. Costly lookups

Uses:
1. Stacks and Queues only need fast operations on the ends,
so linkedlists are ideal :)
 */


import java.util.LinkedList;
import java.util.Stack;

public class LinkedListsExamples {

    public  static void main(String args[]){
        LinkedList<Integer> list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        while (!list1.isEmpty()){
            System.out.println(list1.pop()+list2.pop());
        }
















    }
}
