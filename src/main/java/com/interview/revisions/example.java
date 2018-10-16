package com.interview.revisions;

import java.util.HashMap;
import java.util.Map;

public class example {
    public static int stringProcess(String str) {
        int max =0,start=0;
        for (int i = 0; i < str.length(); i++) {
            Map<Character,Integer> map = new HashMap<>();
            if(map.containsKey(str.charAt(i))){
                int count = map.get(str.charAt(i));
                count = count +1;
                map.put(str.charAt(i),count);
            }else{
                map.put(str.charAt(i),1);
            }


            if (map.size()>2){
                max = Math.max(max,i-start);
                while(map.size()>2){
                    if(map.get(str.charAt(start))>1){
                        int count = map.get(str.charAt(start));
                        count = count -1;
                        map.put(str.charAt(start),count);
                    }else{
                        map.remove(map.get(str.charAt(start)));
                    }
                    start++;
                }

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
