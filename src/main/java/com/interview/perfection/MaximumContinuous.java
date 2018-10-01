package com.interview.perfection;

public class MaximumContinuous {
    public static int continuousSum(int array[]){
        int sum=Integer.MIN_VALUE;
        int temp=0;
        for(int i=0;i< array.length;i++){
            sum=+ array[i];
            if(temp<sum){
                sum=temp;
            }
            if(temp < 0){
                temp=0;
            }
        }
        return sum;

    }
}
