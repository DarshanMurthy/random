package com.interview.experiments;

import java.util.HashMap;

public class LongestSubstringWithKMostDistictCharacters {

    public static void main(String args[]){
        HashMap<Integer, Character> map = new HashMap<>();
        String arr= "valuesstring";
        for(int i=0;i< arr.length();i++){
            for(int j=i+1;j< arr.length();j++){
                System.out.print(arr.substring(i,j));
                System.out.println();
            }
            System.out.println();
        }

    }
}
