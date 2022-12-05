package Day16_Loop_String;

import java.util.Scanner;

public class task1_postive_negative {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number1");
        int pos=0;
        int neg=0;
        for (int i = 0; i < 5; i++) {
            int num=input.nextInt();


        if (num>0){pos++;} else if (num<0){neg++;}


        }input.close();
        System.out.println("neg = " + neg);
        System.out.println("pos = " + pos);
        /*
        Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:				Inputs:
					10
					20
					-1
					0
					3
				Output:
					3 positive and 1 negative
         */
    }
}
