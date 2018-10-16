package com.interview.revisions;

import java.util.HashMap;
import java.util.Map;

public class example {
    public static int stringProcess(String str) {
        int max =0,start=0;
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);
            if(map.containsKey(t)){
                int count = map.get(str.charAt(i));
                map.put(t,++count);
            }else{
                map.put(str.charAt(i),1);
            }

            if (map.size()>2){
                max = Math.max(max,i-start);
                char s = str.charAt(start);
                int cout = map.get(s);
                if(map.containsKey(s)){
                    map.put(s,--cout);
                }else{
                    map.remove(s);
                }
                start++;
            }


        }
        return Math.max(max,str.length()-start);

    }
    public static void main(String arsgs[]){
        // Longest Substing with Atmost k distict characters.
        String arr = "ababababababmnqop";
        System.out.println(stringProcess(arr));
    }
}
