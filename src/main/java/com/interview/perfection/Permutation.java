package com.interview.perfection;

public class Permutation {
    public static String swap(String str,int i, int  j){
        char temp[] = str.toCharArray();
        char x = temp[i];
        temp[i] = temp[j];
        temp[j]=x;
        String f = new String(temp);
        return f;
    }

    public static void permutate(String args, int s, int l){
        if( s == l ){
            System.out.println(args);
        }else {
            for(int i=s; i<=l;i++){
                args = swap(args,s,i);
                permutate(args,s+1, l);
                args =swap(args,s,i);
            }
        }
    }
    public static void main(String args[]){
        String arr="abc";
        permutate(arr,0, arr.length()-1);

    }
}