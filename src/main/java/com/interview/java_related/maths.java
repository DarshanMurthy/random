package com.interview.java_related;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maths {
    public static void main(String args[]){
        System.out.println(Integer.MIN_VALUE);
        int arr[] ={1,2,3,4,5,6,7,8};
        System.out.println(arr.length);

        String s = "nodevalues";
        System.out.println(s.substring(0,1));


        for( int i=0;i< arr.length;i=i+2){
            for(int j=0;j<2;j++){
                System.out.println(arr[i+j]);
            }
        }


        for(int i=0;i<arr.length;i=i+2) {
            int j=i;
            int sum =0;
            for(int k: Arrays.copyOfRange(arr, j, j+2)){
                sum+=k;
            }
            System.out.println(sum);
        }

        char name[]="darshantumkursreenivasamurthy".toCharArray();
        List<String> list = new ArrayList<>();

        for(int p=0;p< name.length;p=p+4){
            int q=p;
            StringBuilder str = new StringBuilder();
            for(char r: Arrays.copyOfRange(name,q,q+2)){
                str.append(r);
            }
            list.add(str.toString());
        }
        for (String str: list){
            System.out.println(str.trim());
        }








    }
}
