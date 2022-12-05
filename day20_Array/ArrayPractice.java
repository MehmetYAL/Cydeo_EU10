package day20_Array;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //store 10.20.50.70
        int [] numbers={10,20,50,70};
        System.out.println(Arrays.toString(numbers));

        System.out.println("=========================================");

        //create a variables that can contain5 scores
        int[] score=new int[5];
score[1]=85;
score[0]=65;
score[score.length-1]=95;
score [2]=55;
score [3]=75;

        System.out.println(Arrays.toString(score));
        System.out.println("========================================================================");

        String[] month={"january","fabruary","march","april","may","june","july","august","september","october",
        "november","december"};
        System.out.println(Arrays.toString(month));
        System.out.println(month[0]);
        System.out.println(month[1]);
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[11]);
        System.out.println("----------------------------------------");
        for (int i = 0; i < month.length ; i++) {//represents the index numbers of array starting from 0
            System.out.println(month[i]);
        }
        System.out.println("------------------------------------");

        for (int k = month.length-1; k >=0 ; k--) {//represents the index numbers of array starting from last index
            System.out.println(month[k]);
        }

    }
}
