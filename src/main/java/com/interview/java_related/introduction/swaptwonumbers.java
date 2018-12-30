package com.interview.java_related.introduction;

public class swaptwonumbers {
    public static void swap(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
    }
    public static void main(String args[]){
        int a=1,b=2;
        swap(a,b);
        System.out.print(a);
    }

}
