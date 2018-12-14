package com.interview.leetcode;

public class PhoneCombination {
   public static void main(String args[]){
       String name = "data";
       for(int i=0;i< name.length();i++){
           System.out.println(name.substring(i));

       }
       recursion(name,-1);
    }
    private static void recursion(String name, int i) {
       i++;
        System.out.println(i);

        if(i== name.length()-1) return;

       System.out.println(name.substring(i));

       recursion(name.substring(i),i);

    }

}
