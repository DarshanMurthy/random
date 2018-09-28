package com.interview.testing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;


class Interval{
    int start;
    int end;
    Interval(int start, int end ){
        this.start = start;
        this.end= end;
    }
}

public class fib {

    public static  void main(String args[]){
        int start[] ={1,2,8,15};
        int end[] ={3,6,8,18};
        int n= start.length;

        for(int i=0,j=0;i<n;i++){
            if(i== n-1||start[i+1]<end[j]){
                System.out.print(start[j]);
                System.out.print(end[i]);
                j=i+1;
            }
            System.out.println();
        }












    }


}
