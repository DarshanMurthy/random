package com.interview.java_related.introduction;

public class evenorodd {
    public static void resursiveOne(int value){
        if(value == 0){
            return;
        }
        System.out.println(value);
        value = value/10;
        resursiveOne(value);

    }
    public static void main (String args[]){
        resursiveOne(1024);
    }
}
