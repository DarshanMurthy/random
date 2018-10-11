package com.interview.revisions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class substringexample {
    public static void main(String args[]){
        String s = "barfoothefoobarman";
        String words[]={"bar", "foo"};
        int len = words[0].length();
        
        for(int j=0; j<len; j++) {
            for (int i = j; i <= s.length() - len; i = i + len) {
                String sub = s.substring(i, i+len);
                System.out.print(sub);
                System.out.print(" ");
            }
            System.out.println();
        }



    }

}
