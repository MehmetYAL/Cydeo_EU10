package day20_Array;

import java.util.Scanner;

public class AvarageNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] numbers={10,20,30,40,50,60};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }double avarageNumber=sum/numbers.length;
        System.out.println("avarageNumber = " + avarageNumber);
    }
}
