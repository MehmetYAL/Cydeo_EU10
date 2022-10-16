package day13_StringClass;

import java.util.Scanner;

public class task6_day13 {
    public static void main(String[] args) {
        /*
        write a program that asks the user enter a three letter word. Check if
the middle character of the given word is 'a'. In the case it is
print: "Cool word", but in the case the middle letter is not 'a'
print: "Okay word".
- If the user does not enter a 3 letter word tell them:
If the word is less than 3 letters: "Word is too short"
If the word is too long: "Word is too long"
         */
        Scanner input=new Scanner(System.in);
        System.out.println("write tree letters words");
        String word=input.next();
        char w1=word.charAt(1);

        if (w1=='a'){
            System.out.println("cool word");   }
        else if (w1!='a') {
            System.out.println("okay word");

        } else if (word.length()>3) {
            System.out.println(" word is too long");
        } else if (word.length()<3) {
            System.out.println("word is too short");

        }


    }
}
