package day12_Scanner;

import java.util.Scanner;

public class ScannerPratctice_NextLine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your full name");
        String fullName=input.nextLine();

        System.out.println("enter your programming language: ");
        String programmingLanguage=input.nextLine();

        System.out.println("enter your age");
        int age=input.nextInt();
        input.nextLine();
        System.out.println("enter your school name");
        String schoolName=input.nextLine();//enter---should enter be taking out


        System.out.println("fullName = " + fullName);
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);//enter
input.close();
    }
}
