package day13_StringClass;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {

        //firstName="wooden"
        //lastName="Spoon"
        //output:w.s.

        Scanner input=new Scanner(System.in);

        System.out.println("enter your first name");
        String firstName= input.next();
        System.out.println("enter your last name");
        String lastName= input.next();

       char f =firstName.charAt(0);
        char l =lastName.charAt(0);

        String initial=f+"."+l;

        System.out.println("initial "+initial);
        input.close();
    }
}
