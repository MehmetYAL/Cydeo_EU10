package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("how many number do you want to enter");
        int length= input.nextInt();
        if (length<=0){
            System.out.println("invalid entry");
            System.exit(0);
        }
        int[] num=new int[length];//array needs to have enough capacity to contain all the elements user going to enter
        for (int i = 0; i <length ; i++) {
            System.out.println("enter a number");
           num[i]= input.nextInt();//each input user provided during each execution of the loop
            //will be assigned

        }
        System.out.println(Arrays.toString(num));
input.close();
    }
}
