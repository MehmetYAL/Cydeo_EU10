package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] numbers=new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter numbers");
            numbers[i]=input.nextInt();//each user entered input willbe assigned to the
            //index of array numbers
                   }
        int max=numbers[0];
        int min=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
         if (numbers[i]>max){max=numbers[i];}
            if (numbers[i]<min){min=numbers[i];}
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println(Arrays.toString(numbers));

    }
}
