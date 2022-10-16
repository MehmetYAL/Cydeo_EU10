package day15_StringAnd_ForLoop;

import java.util.Scanner;

public class MAximumNumber {
    public static void main(String[] args) {
           //ask usr=er to enter a number for 5 times. return maximum number
        Scanner input=new Scanner(System.in);

        int max=-2147483648;

        for (int i = 0; i <5 ; i++) {

            System.out.println("enter a number");
            int num=input.nextInt();
            if (num>max){ max=num;

            } 

        }
        System.out.println("max = " + max);
        input.close();

    }
}
