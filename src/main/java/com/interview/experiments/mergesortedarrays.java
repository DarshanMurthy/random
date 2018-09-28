package com.interview.experiments;

public class mergesortedarrays {
    public static  void main(String args[]){

        int arr1[] ={-1,-2,1,2};
        int arr2[] = {3,4,5,6,9,10};
        int arr3[] = new int[arr1.length+ arr2.length];
        int m=0,j=0;
        for(int i=0;i< arr1.length;i++){
            if(arr1[i]<arr2[j]){
                arr3[m] = arr1[i];
                m++;
            }
            else{
                arr3[m] = arr2[j];
                j++;
                m++;
            }
        }

        for(int f=j;f<arr2.length;f++){
            arr3[m]=arr2[f];
            m++;
        }

        for( int q=0;q< arr3.length;q++){
            System.out.print(arr3[q]);
        }
    }

}
