package com.interview.sorting_techniques;

public class BubbleSort {
    public static int [] bubbleSort(int arr[]){
        for(int i=0;i< arr.length;i++){
            for( int j=i+1;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp= arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
    public static void main(String args[]){
        int arr[]={20,2,-1,-9,1};
        int f_arr[]=bubbleSort(arr);
        for( int j=0;j<f_arr.length;j++){
            System.out.println(f_arr[j]);
        }


    }
}
