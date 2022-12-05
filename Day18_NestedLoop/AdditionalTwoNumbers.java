package Day18_NestedLoop;

import java.util.Scanner;

public class AdditionalTwoNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       while(true) {

           System.out.println("enter yout first number");
           int num1 = input.nextInt();
           System.out.println("enter yout second number");
           int num2 = input.nextInt();
           System.out.println("Addition " + (num1 + num2)
           );

           System.out.println("would you like to continue");
           String a= input.next().toLowerCase();
           while (!(a.equals("yes")||a.equals("no"))){
               System.err.println("Invalid Entry,please re enter");
               a=input.next().toLowerCase();
           }
           if (a.equals("no")){
               break;
           }if (a.equals("yes")){
               System.out.println("enter your additional number");
           }
       }

input.close();

    }
}
