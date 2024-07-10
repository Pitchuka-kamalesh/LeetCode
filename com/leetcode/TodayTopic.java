package com.leetcode;
import java.util.*;

public class TodayTopic {
    public static void main(String[] args) {

        List<String> SurName = new ArrayList<>(Arrays.asList("Test","Apple","Sorted","Parrot"));
        System.out.println(SurName);
        Collections.sort(SurName);

        System.out.println(SurName.get(1).compareTo(SurName.get(2)));


        String  na = countingVowlesConsonents(stringToChar("kamal"));
        System.out.println(na);

    }

    public static String countingVowlesConsonents(char[] args) {
        List<Integer> count = new ArrayList<>();
        Map<String,Integer> totalCount = new HashMap<>();
        totalCount.put("vowels",0);
        totalCount.put("consonants",0);

        String vowles = "aeiou";
        for (char arg : args){
            if(vowles.contains(String.valueOf(arg))){
                totalCount.replace("vowels", totalCount.get("vowels")+1);
            }else {
                totalCount.replace("consonants", totalCount.get("consonants")+1);
            }

        }

        return totalCount.toString();
    }

    public static char[] stringToChar(String args){

        return args.toLowerCase().toCharArray();


    }
}
