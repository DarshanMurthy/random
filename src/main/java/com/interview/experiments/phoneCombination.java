package com.interview.experiments;

import java.util.LinkedList;

public class phoneCombination {
    public static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void combinationPrint(String digits,
                                        String prefix,
                                        LinkedList<String> list,
                                        int level){
        if(level == prefix.length()){
            list.add(prefix);
            return;
        }

        String letters = KEYS[digits.charAt(level)-'0'];
        for(int i=0;i< letters.length();i++){
            combinationPrint(digits, prefix+letters.charAt(i),list,level+1 );

        }
    }

    public static void main(String args[]){
        String digits="23";
        int level =0;
        String prefix="";
        LinkedList<String> list = new LinkedList<>();
        combinationPrint(digits,prefix,list,level);
        for(String i: list){
            System.out.println(i);

        }






    }


}
