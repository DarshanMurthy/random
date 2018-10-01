package com.interview.experiments;

public class SwapCharacters {

    public static char[] swap(String str,int  i, int j){
        char[] temp = str.toCharArray();
        char inter=temp[i];
        temp[i] = temp[j];
        temp[j] = inter;
        return temp;

    }
    public static void main(String args []){
        String str="murthy1234";
        System.out.println(swap(str, 0,2));
    }
}
