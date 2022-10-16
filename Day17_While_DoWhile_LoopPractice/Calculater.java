package Day17_While_DoWhile_LoopPractice;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your first number");
        int num1=input.nextInt();
        System.out.println("enter your second number");
        int num2= input.nextInt();
        System.out.println("enter math operator");
        char opr=input.next().charAt(0);

        while (!(opr=='+'||opr=='-')){
            System.err.println("Invalid operator, please re=enter");
            opr=input.next().charAt(0);
        }
        System.out.println( (opr=='+')? num1+num2:num1-num2);
    }
}
