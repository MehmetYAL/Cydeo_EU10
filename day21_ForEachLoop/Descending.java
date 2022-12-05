package day21_ForEachLoop;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        int[] arr={1,2,5,3,4,6,7};
        Arrays.sort(arr);
        int[] reverse=new int[arr.length];
        for (int i = arr.length - 1,k=0; i>= 0; i--,k++) {
            reverse[i]=arr[k];

        }
        System.out.println(Arrays.toString(reverse));

    }
}
/*
1. Write a program that sort the array of integer in descending
order
 */