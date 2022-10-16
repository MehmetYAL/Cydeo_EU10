package day13_StringClass;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write your first sentence");
        String str1= input.nextLine();
        System.out.println("write your second string");
        String str2=input.nextLine();

        int s1=str1.length();
        int s2=str2.length();

        if (s1>s2){
            System.out.println(str1);}
        else {
            System.out.println(str2);}

input.close();
    }
}
