package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Sample2 {

    public static void main(String[] args) {
        int limit = 100;
        for(int i = 2; i<=limit;i++){
            int count = 0;
            for(int j = 1;j<=i/2;j++){
                if(i%j == 0){
                    count++;
                }

            }
            if (count ==1){
                System.out.println("Number is prime number" + i);
            }
        }

    }
}