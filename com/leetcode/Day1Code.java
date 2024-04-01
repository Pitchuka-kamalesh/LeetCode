package com.leetcode;

public class Day1Code {

    /*
    * Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.


Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.



    * */

    public static int lengthOfLastWord(String input){
        String data = input.strip();
        int length = 0;

        for (int i = data.length()-1;i>=0;i--){
            if (data.charAt(i) != ' ') length++;
            else if (length > 0) {
                break;
            }
        }

        return length;
    }

    public static int lengthOfLastWordModel2(String arg0){
        String[] input = arg0.strip().split(" ");

        return input[input.length-1].length();

    }


    public static void main(String[] args) {
//        User has given the a string
       int val =  lengthOfLastWordModel2("   fly me   to   the moon  ");
        System.out.println(val);

    }
}
