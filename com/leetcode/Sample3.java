package com.leetcode;

import java.util.*;

public class Sample3 {

//    input = abc1888,88hht,dfsd34,abc234,abd345
//    output = dfsd34,88hht,abc234,abd345,abc1888,

    public static void main(String[] args) {
        List<String> input = new ArrayList<>(Arrays.asList("abc1888","88hht","dfsd34","abc234","abd345"));
        Map<String,String>  holder = new HashMap<>();
        for(String i : input){    //i = "88hht"
            String iKeys = i.replaceAll("[a-z]+","");  // 88
            holder.put(iKeys,i); //88,"88hht"

        }

        List<Integer> keySorted = new ArrayList<>();
        for(String i : holder.keySet()){ //i 1888,88,34,234,345
            keySorted.add(Integer.parseInt(i));
        }
        Collections.sort(keySorted); // 34,88,234,35,1888
        System.out.println(keySorted);

        for (int i:keySorted){ // 34,88,234,35,1888
            System.out.print(holder.get(String.valueOf(i))+",");

        }

    }

}
