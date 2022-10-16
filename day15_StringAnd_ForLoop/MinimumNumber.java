package day15_StringAnd_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int min=2147483647;

        for (int i = 0; i <5 ; i++) {
            System.out.println("enter a number");
            int num=input.nextInt();
            if (num<min){min=num;

            }


        }
        System.out.println("min = " + min);
    }
}
