package com.interview.experiments;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * abc
 * def
 *
 * a -> d
 * a -> e
 * a -> f
 *
 *
 * 2
 * 3
 */

public class phoneProblem {
//
//    public static  void bfs(String digits){
//        for(int i=0;i< digits.length();i++){
//
//        }
//    }
    public static void  main(String args[]){
        //bfs("23");
        String digits="abcdef";
        LinkedList<Character> list = new LinkedList<>();
        for(Character i: digits.toCharArray()){
            list.add(i);
        }
        while (!list.isEmpty()){
            System.out.print(list.poll());
        }
        LinkedList<Character> stack = new LinkedList<>();
    }
}
