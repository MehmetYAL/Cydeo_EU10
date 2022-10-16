package day13_StringClass;

import java.util.Scanner;

public class FfistLastCh {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your program language");
        String sentence=input.nextLine();
        System.out.println("sentence = " + sentence);
         char firstCharacter= sentence.charAt(0);
         char lastCharacter=sentence.charAt(sentence.length()-1);
//char lastCharacter=s1.charAt(s1.length()-1);
       System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);
        System.out.println("------------------------------------------");

        System.out.println("enter your school name first word");
        String schoolFirstWord=input.next();
        System.out.println("enter your school name second word");
        String schoolSecondWord=input.next();
        char fCh=schoolFirstWord.charAt(0);
        char lCh=schoolSecondWord.charAt((0));
         String initial=fCh+". "+lCh;
        System.out.println(schoolFirstWord);
        System.out.println(schoolSecondWord);
        System.out.println("initial = " + initial);




input.close();

    }
}
