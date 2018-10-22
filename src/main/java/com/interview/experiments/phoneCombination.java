package com.interview.experiments;

public class phoneCombination {

    public static void main(String args[]){
        final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        String digits="25987";

        for(int i=0;i< digits.length();i++){
            System.out.println(KEYS[(digits.charAt(i)-'0')]);
        }





    }


}
