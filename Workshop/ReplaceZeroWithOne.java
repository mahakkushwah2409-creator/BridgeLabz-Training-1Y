package com.gla.Workshop;

public class ReplaceZeroWithOne {
    public static void main(String[] args){
        int digit = 12000;
        String result = String.valueOf(digit).replace('0' , '1');
        int FinalResult = Integer.parseInt(result);
        System.out.println(FinalResult);


    }
}
