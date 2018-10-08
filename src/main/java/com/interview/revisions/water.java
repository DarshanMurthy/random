package com.interview.revisions;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Interval{
    int start;
    int end;
    Interval(int start,int end){
        this.start = start;
        this.end = end;
    }
    int dispaly(){
        return this.end;
    }
}


public class water {
    public static void main(String args[]){
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        for( int i: list){
            System.out.println(i);
        }
        Interval temp = new Interval(1,1);
        System.out.print(temp.dispaly()* temp.dispaly());
    }
}
