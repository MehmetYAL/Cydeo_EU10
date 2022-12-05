package Day17_While_DoWhile_LoopPractice;

import java.util.Scanner;

public class CalculatesTwoNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a first number");
        int first= input.nextInt();
        System.out.println("enter a second number");
        int second=input.nextInt();
        System.out.println("enter the math operater");
        char opr=input.next().charAt(0);

        while (!(opr=='+'||opr=='-'||opr=='/'||opr=='*')){
            System.out.println("invalid,re enter operator");
            opr=input.next().charAt(0);


        }switch (opr) {
            case '+':
                System.out.println(first+second);
                break;
            case '-':
                System.out.println(first-second);
                break;
            case '/':
                System.out.println(first/second);
                break;
            case '*':
                System.out.println(first*second);
                break;
        }input.close();

        /*
        write a program to ask user to enter two number and math operator,
and return the result.
if the operator is invalid operator, ask user to re-enter
the operator until user provides a valid operator (+, -, *, /)
         */

    }
}
