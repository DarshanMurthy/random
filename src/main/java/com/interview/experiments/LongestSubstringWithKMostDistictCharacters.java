package com.interview.experiments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubstringWithKMostDistictCharacters {

    public static void main(String args[]){
        String arr= "abcbbbbcccbdddadacb";
        ArrayList<Character> list = new ArrayList<>();


       for(int i=0;i< arr.length();i++){
           int arr1[] = new int[2];
           arr1[0]=arr.charAt(i);
           list.add(arr.charAt(i));

           int count=1;
//            HashMap<Character,Integer> map = new HashMap<>();
//            map.put(arr.charAt(i),0);
            for(int j=i+1;j< arr.length();j++){
                if(arr1[0] !=arr.charAt(j) && count == 2){
                    arr1[1]=arr.charAt(j);
                    
                    count++;
                }else if( arr1[0] ==arr.charAt(j) || arr1[1] == arr.charAt(j)){

                }
                else {
                    break;
                }
//                if(map.containsKey(arr.charAt(i))) break;
//                map.put(arr.charAt(i),0);
//                System.out.print(arr.substring(i,j));
//                System.out.println();
            }
//            list.add(map);
//            System.out.println();
        }

//        for(HashMap i: list){
//            System.out.println(i.keySet());
//        }




    }
}
