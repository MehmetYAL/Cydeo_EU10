package Day17_While_DoWhile_LoopPractice;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        //username:"cydeo"
        //password:"cydeo123
        Scanner input=new Scanner(System.in);
        //String userName="Cydeo";
        //String pass="cydeo123";
        int attempt=0;
        System.out.println("Enter your username");
        String userName=input.next();

        System.out.println("enter your password");
        String pass=input.next();

            if (userName.equals("Cydeo")&&pass.equals("cydeo123")){
                System.out.println("logged in");
            }else {
        /*int*/       attempt=3;
                while (!((userName.equals("Cydeo"))&&pass.equals("cydeo123"))&&attempt>0){
                    System.out.println("Incorrect username or password,please re-enter");
                    System.out.println("enter your username:");
                    userName=input.next();

                    System.out.println("enter your password");
                    pass= input.next();
                    attempt--;                          }
            }if (userName.equals("Cydeo")&&pass.equals("cydeo123")){
            System.out.println("logged in");}
            else {
            System.out.println("your account is locked");
        }

        }

    }

