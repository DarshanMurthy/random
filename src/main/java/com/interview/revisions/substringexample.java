package com.interview.revisions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class substringexample {
    public static void main(String args[]){
        int arr[] ={ 1,2,3,4,5,6,7,8,9,9};
        for(int i=0;i<arr.length;i=i+2) {
            int j=i;
            int sum =0;
            for(int k:Arrays.copyOfRange(arr, j, j+2)){
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
