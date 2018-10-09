package com.interview.experiments;

import java.util.ArrayList;
import java.util.HashMap;

public class SSWCAW {
    public static void main(String args[]){
        String s = "barfoothefoobarman";
        String [] words = {"foo","bar"};
        HashMap<Character, String> map =
                new HashMap<>();
        int wordsLen=0;
        for( String word: words){
            map.put(word.charAt(0),word);
            wordsLen+=word.length();
        }
        int len = s.length();
        int counter=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i< len;i++){
            while (map.containsKey(s.charAt(i)) && counter!=words.length){
                counter ++;
                i += map.get(s.charAt(i)).length();
            }
            if(counter == words.length){
                list.add(i-wordsLen);
                counter=0;
            }
        }
    }
}
