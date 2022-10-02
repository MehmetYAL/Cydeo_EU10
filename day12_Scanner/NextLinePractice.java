package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the age");
        int age=input.nextInt();    //enter should be erase by the --input.nextLine
        input.nextLine();    //capture the Entre key that user pressed for nextInt()
        System.out.println("enter the full name");
String fullName=input.nextLine();


        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        input.close();

    }
}
