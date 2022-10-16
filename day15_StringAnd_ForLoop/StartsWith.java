package day15_StringAnd_ForLoop;

import java.util.Scanner;

public class StartsWith {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a word");
        String word= input.next();
        if (word.charAt(0)=='x'){ word=word.replaceFirst("x","a");}
        System.out.println(word);

        System.out.println("---------------------------------");
        System.out.println("enter a second word");
        String secondWord= input.next();
      secondWord=  secondWord.replace('x','a').replace('X','a');
        System.out.println(secondWord);

    }
}
