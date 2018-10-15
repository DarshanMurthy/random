package com.interview.revisions;

public class random {
    public static void main(String args[]){
        System.out.println();
        String arr="abcbbbbcccbdddadacb";
        char[] temp = arr.toCharArray();
        for( int i=0;i< arr.length();i++){
            for(int j=i+1;j< arr .length();j++){
                System.out.printf("%c,%c",temp[i],temp[j]);
                System.out.println();
                if(temp[i]> temp[j]){
                    char p = temp[i];
                    temp[i] = temp[j];
                    temp[j]=p;
                }
            }
        }

        String str= new String(temp);
        System.out.println(str);
    }
}
