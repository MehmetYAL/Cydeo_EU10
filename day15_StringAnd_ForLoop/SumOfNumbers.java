package day15_StringAnd_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        double sum=0;
        for (int i = 1; i <=100 ; i++) {
            sum+=i;

        }
        System.out.println(sum);

        System.out.println("-----------------------------------------");
        Scanner input=new Scanner(System.in);
int total=0;
        for (int i = 0; i <5 ; i++) {

                System.out.println("enter a number");
    total += input.nextInt();}

        System.out.println(total);
input.close();
    }
}
