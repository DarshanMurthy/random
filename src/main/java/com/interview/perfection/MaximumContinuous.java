package com.interview.perfection;

public class MaximumContinuous {
    public int continuousSum(int array[]){
        int sum=Integer.MIN_VALUE;
        int temp=0;
        for(int i=0;i< array.length;i++){
            temp += array[i];
            if(temp > sum){
                sum=temp;
            }
            if(temp<0){
                temp=0;
            }
        }
        return sum;

    }
    public  static void main( String args[]){
        int arr[] ={1,2,3,4};
        MaximumContinuous ms = new MaximumContinuous();
        System.out.println(ms.continuousSum(arr));

    }
}
