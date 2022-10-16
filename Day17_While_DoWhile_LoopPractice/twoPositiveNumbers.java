package Day16_Loop_String;

import java.util.Scanner;

public class twoPositiveNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter two positive numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        input.nextLine();
        int mul=0;
        for (int i = 0; i <num2; i++) {
            mul+=num1;
        }
        System.out.println("mul= "+ mul);
    }
}
