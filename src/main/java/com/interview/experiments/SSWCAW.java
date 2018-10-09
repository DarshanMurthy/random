package com.interview.experiments;

import java.util.HashMap;

public class SSWCAW {
    public static void main(String args[]){
        String s = "barfoothefoobarman";
        String [] words = {"foo","bar"};
        HashMap<Character, String> map =
                new HashMap<>();
        for( String word: words){
            map.put(word.charAt(0),word);
        }
        int len = s.length();
        for(int i=0;i< len;i++){
            
        }
    }
}
