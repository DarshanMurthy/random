package com.interview.revisions;


public class sum {
    public static String swap ( String str, int i, int j) {
        char [ ] temp = str.toCharArray( );
        char h = temp[i];
        temp[i] = temp[j];
        temp[j] = h;
        return String.valueOf(temp);
    }


    public static void permute(String str, int s, int e) {
        if (s == e) {
            System.out.println(str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                str = swap(str, s, i);
                permute(str, s + 1, e);
                str = swap(str, s, i);
            }
        }
    }


    public static void main(String args[]){
        String permute="abcd";
        permute(permute, 0, permute.length());

        //Efficiency: O( N * N! )


    }

}
