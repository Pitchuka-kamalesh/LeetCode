package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class IsPrime {
    public static List<Integer> primeNumber = new ArrayList<>();
    public static void main(String[] args) {

        numberCount(20);
        System.out.println(primeNumber.toString());

    }

    public static void checkPrime(int num){
        int count = 0;
        for(int i = 1;i<= num/2;i++){
            if(num%i == 0){
                count++;
            }
        }
        if (count <=1){
            primeNumber.add(num);
        }
    }

    public static void numberCount(int arg){
        for (int i = 2;i<=arg;i++){
            checkPrime(i);
        }
    }

}
