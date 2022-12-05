package day21_ForEachLoop;

import java.util.Arrays;
import java.util.StringJoiner;

public class ArraysOfMerge {
    public static void main(String[] args) {
        String[] arr1={"Ali","mehmet","alper"};
        String[] arr2 = {"ayse","fatma","hasan","huseyin"};
        /* birden fazla arrays toplamak icin once arryslar yeni array olarak toplanir
        sonra her biri icin ayri each Loop yapilir, olusturulan integer=0 da
        yeni olusturulan Array toplanir ve for degeri verilen variabla esitlenir.
        sonra yeni olusturulan Array print edilir...

         */

        String[] students=new String[arr1.length+ arr2.length];//make sure new array is have the sam capacity
int i=0;
        for (String each : arr1) {students[i++]=each;
        }
        for (String each2 : arr2) {
            students[i++]=each2;
        }
        //int arr1N=new arr1;

        System.out.println(Arrays.toString(students));
        System.out.println("--------------------------------------------------------------");

        char[] ch1={'A','B','C','D'};
        char[] ch2={'e','f','g','h','j'};

        char[] charsYeni=new char[ch1.length+ch2.length];
        int sum=0;
        for (char c : ch1) {
            charsYeni[sum++]=c;
        }
        for (char c : ch2) {
charsYeni[sum++]=c;
            }
        System.out.println(Arrays.toString(charsYeni));
    }
}
/*
Task
1. write a program that can merge two arrays of integers
Ex:
arr1 = {1,2,3,4}
arr2 = {5,6}
output
arr3 = {1,2,3,4,5,6}
 */