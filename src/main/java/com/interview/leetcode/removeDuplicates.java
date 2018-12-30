package com.interview.leetcode;



public class removeDuplicates {

    public  static void main (String args[]){
       int A[] ={1,1,1,1,2,2,2,3,3,3};
        int i = 1, j = 1,cnt = 1,k=3;
        while (j < A.length) {
            if (A[j] != A[j-1]) {
                cnt = 1;
                A[i] = A[j];
                i=i+1;
            }
            else {
                if (cnt < k) {
                    A[i] = A[j];
                    i=i+1;
                    cnt++;
                }
            }
            j++;
        }

       for(int m=0;m<i;m++){
           System.out.println(A[m]);
       }



    }


}
