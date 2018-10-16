package com.interview.revisions;

import java.util.HashMap;
import java.util.Map;

public class example {


    public static void main(String arsgs[]){
        String s="barfo" ;
        String [] words={"foo", "bar"};
        int len = words[0].length();
        for(int j=0;j< len;j++){
            for(int i=j;i< s.length()-len;i=i+len){
                String sub = s.substring(i, i+len);
                System.out.println(sub);
            }
            System.out.println();
        }




    }
}
