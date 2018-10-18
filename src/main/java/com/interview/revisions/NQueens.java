package com.interview.revisions;

import sun.plugin.javascript.navig.Link;

import java.util.LinkedList;
import java.util.List;

public class NQueens {
    public  static  int numofrows=4;

    /**
     * 1 Stopping Condition
     * 2 Validation*
     * */

    public static  boolean validate(List<List<String>> list,int row,int col){
        return true;
    }

    public static void dfs(List<List<String>> list,int col){
        if(col == 4){

            return;
        }
        for(int i=0;i<numofrows;i++){
            if (validate(list,i,col)){
                list.get(i);

            }
        }

    }

    public static void main(String args[]){
        List<List<String>> list = new LinkedList<>();
        int n = 4;
        for(int i=0;i<n;i++){
            List<String> temp = new LinkedList<>();
            for(int j=0;j< n;j++){
                temp.add("Q");
            }
            list.add(temp);
        }

        for(List<String> i :list){

            for(String j: i) {
                System.out.print(j);
            }

        }

        for(int row=0;row < list.size();row++){
            int col = list.get(row).size();
            for(int j=0;j<col;j++ ){

            }

        }






    }
}
