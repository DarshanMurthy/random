package com.interview.revisions;

import sun.plugin.javascript.navig.Link;

import java.util.LinkedList;
import java.util.List;

public class NQueens {
    public static List<List<String>> list = new LinkedList<>();
    public static void dfs(String arr[][],int col){
        if(col == arr[0].length){
            List<String> list1 = new LinkedList<>();

            for(int i=0;i<4;i++){
                for(int j=0;i<4;i++){
                    list1.add(arr[i][j]);
                }
            }


            list.add(list1);
            return;
        }
        for(int i=0;i< arr.length;i++){
            arr[i][col] = "Q";
            dfs(arr,col+1);
            arr[i][col] ="";
        }
    }

    public static void main(String args[]){
        String arr[][] = new String[4][4];
        dfs(arr,0);
        for (List<String> i: list){
            System.out.println(i);
        }

        //List<String> list = new LinkedList<>();
//        list.add("temp");
//
//        for(String str: list){
//            System.out.print(str);
//        }


    }


}
