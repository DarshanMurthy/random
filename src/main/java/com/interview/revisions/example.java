package com.interview.revisions;

import java.util.HashMap;
import java.util.Map;

public class example {
    public static void main(String arsgs[]){
       String name="barfoothefoobarman";
       String words[] ={"foo","bar"};
       int len = words[0].length();
       for(int i=0;i<len;i++){
           for(int j=i;j<=name.length()-len;j=j+len){
               System.out.println(name.substring(j,j+len));
           }
       }
       String n1="darshan";
       String temp="rs";

       for(int k=0;k<n1.length()-temp.length();k++){
           for(int l=0;l< temp.length();l++){
               
           }
       }


    }
}
