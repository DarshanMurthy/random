package com.interview.java_related;

import java.util.Arrays;
/*
String is immutable
 */

public class arraySlicing {

    public static void main(String args[]){

        /**
         * copyOfRange basically copies
         * elements from "from" to "to-1" indexed
         * elements.
         */
        int arr[] = {12,3,4,5};
        for(int i :Arrays.copyOfRange(arr,1,3)){
            System.out.print(i);
        }
    }

    public static class SwapCharacters {

        public static String swap(String str,int  i, int j){
            char[] temp = str.toCharArray();
            char inter=temp[i];
            temp[i] = temp[j];
            temp[j] = inter;
            return String.valueOf(temp);

        }
        public static void main(String args []){
           String swaped_string =swap("testcase",1,2);
           System.out.println(swaped_string);
        }
    }
}
