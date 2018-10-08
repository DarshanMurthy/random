package com.interview.java_related;

public class IndexofAndSubstring {
    public  static void main(String args[]){
        String pre="godisgreat";
        String str = "god";
        System.out.println(str.indexOf(pre));
        //System.out.println(pre.substring(0,pre.length()-1));

        String test1="value";
        String test2="tempvaluenotes";
        System.out.println(test1.indexOf(test2));
        System.out.println(test2.indexOf(test1));

        String test3="darshan";
        System.out.println(test3.indexOf('a'));

        String strs[] ={"leet","leetm","leetmode"};

        System.out.println(strs[0].indexOf(strs[1]));
    }
}
