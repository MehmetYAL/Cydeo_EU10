package Day18_NestedLoop;

import java.util.Scanner;

public class OddAndEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
while (true) {
    System.out.println("enter a number");
    int num = input.nextInt();

        if (num % 2 == 0) {
            // num++;
            System.out.print(num + " is even number ");
        } else {
            System.out.println(num + " is odd number ");
        }
    System.out.println("would you like to enter another number");
        String ans= input.next().toLowerCase();
while (!(ans.equals("no")||ans.equals("yes"))){
    System.out.println("Invalid answer, please anter yes or no");
    ans= input.next().toLowerCase();
} if (ans.equals("no"))
 {              break; }
input.close();

}/*Write a program that asks user to enter a numnber ,
        and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps
        */
}}