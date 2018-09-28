package com.interview.experiments;

import java.util.HashMap;

public class LongestSubStiring {

    public static  boolean check(String str){
        HashMap<Character,Integer> map = new HashMap<>();
            for(char i: str.toCharArray()){
            if(map.containsKey(i)){
                return false;
            }else{
                map.put(i,1 );
            }
        }
        return true;
    }



    public static void main(String args[]){

        String temp="abcabcbb";
        //char temp [] = name.toCharArray();
        int len = 0;
        for(int i=0;i<=temp.length();i++){
            for(int j=i+1;j<=temp.length();j++) {
                if(check(temp.substring(i,j))){
                    if(len<temp.substring(i,j).length()){
                        len= temp.substring(i,j).length();
                    }

                }else{
                    break;
                }
            }
        }
        System.out.println(len);
//        String value="darshan";
//        System.out.println(value.substring(1,1));
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(char i: value.toCharArray()){
//            if(map.containsKey(i)){
//                break;
//            }else{
//                map.put(i,1 );
//            }
//        }
//
//       System.out.println(map.keySet().size());
    }
}
