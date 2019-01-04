package com.interview.java_related.priorityqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String args[]){
        String s="abacaaabbccdd";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            int a=map.getOrDefault(s.charAt(i),0)+1;
            map.put(s.charAt(i),a);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for( char c: s.toCharArray()){
            queue.add(new int [] {c,map.get(c)});
        }
        while(!queue.isEmpty()){
            System.out.println((char)queue.poll()[0]+"-->"+(int)queue.poll()[1]);
        }
    }

}
