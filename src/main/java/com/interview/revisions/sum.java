package com.interview.revisions;


public class sum {
    String swap( String str, int s, int e){
        char[] temp = str.toCharArray();
        char i = temp[s];
        temp[s]=temp[e];
        temp[e]=i;
        return new String(temp);
    }
    void permute(String str, int s, int e){
        if(s == e){
            System.out.println(str);
        }
        for(int i=s;i<=e;i++){
            str=swap(str,s,i);
            permute(str,s+1, e);
            str=swap(str, s,i);
        }
    }
    public static void main(String args[]){
        sum s1 = new sum();
        s1.permute("abc",0, "value".length()-1);
        //Efficiency: O( N * N! )
    }

}
