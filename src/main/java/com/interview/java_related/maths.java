package com.interview.java_related;

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


    }
}
