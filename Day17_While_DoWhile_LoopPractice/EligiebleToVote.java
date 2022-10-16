package Day17_While_DoWhile_LoopPractice;

import java.util.Scanner;

public class EligiebleToVote {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter your age: ");
        int age=input.nextInt();

       while (!(age>18&&age<120)){
           System.err.println("Invalid age,please enter your age");
           age=input.nextInt();  }

        System.out.println("are you citizen? yes or no");
        String str= input.next().toLowerCase();
       while (!(str.equals("yes")||str.equals("no"))){
           System.out.println("invalid answer");
           System.out.println("are you citizen? yes or no");
           str= input.next().toLowerCase();}
           if (age>18&&str.equals("yes")){
                              System.out.println("are eligible to vote");

           }
       else {
               System.out.println("not eligible to vote");
           }
        }
    }

