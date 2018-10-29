package com.interview.experiments;

import java.util.*;

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

   public static final Map<String, String> myMap;
    static
    {
        myMap = new HashMap<String, String>();
        myMap.put("a", "b");
        myMap.put("c", "d");
    }


//
    public static  void bfs(char i){
        System.out.print(myMap.get("a"));

    }
    public static void  main(String args[]){
        //bfs("23");

        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");

        String digits="23";
        LinkedList<Character> list = new LinkedList<>();
        for(Character i: digits.toCharArray()){
            list.add(i);
        }
        while (!list.isEmpty()){
            bfs(list.poll());
        }
        LinkedList<Character> stack = new LinkedList<>();
    }
}
