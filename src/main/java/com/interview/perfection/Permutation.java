package com.interview.perfection;

public class Permutation {
    public static void swap(String str,char i, char j){
        char temp;
        temp = str.charAt(i);
        //str.charAt(i)=str.charAt(j);
        j=temp;
    }

    public static void permutate(String args, int s, int l){
        if( s == l ){
            System.out.println(args);
        }else {
            for(int i=s; i<=l;i++){
                swap(args,args.charAt(s), args.charAt(i));
                permutate(args,s+1, l);
                swap(args,args.charAt(s),args.charAt(i));
            }
        }
    }
    public static void main(String args[]){
        String arr="darshan";
        permutate(arr,0, arr.length()-1);

    }
}