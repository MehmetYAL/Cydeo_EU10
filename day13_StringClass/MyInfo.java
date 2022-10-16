package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your age");
        int age= input.nextInt();
        input.nextLine();
        System.out.println("enter your full name");
        String fullName=input.nextLine();

        System.out.println("enter your phone number");
        long phoneNumber=input.nextLong();
        System.out.println("enter your zip code");
        int zipCode=input.nextInt();
        input.nextLine();
        System.out.println("enter your school name");
        String schoolName= input.nextLine();
        System.out.println("enter your city name");
        String cityName= input.nextLine();
        System.out.println("enter your state name");
        String stateName= input.next();
        input.nextLine();
        System.out.println("enter your building number");
        String buildingNumber= input.nextLine();
        System.out.println("enter your street name");
        String streetName= input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("zipCode = " + zipCode);
        System.out.println("schoolName = " + schoolName);
                System.out.println("stateName = " + stateName);
        System.out.println("Adress :\n " + buildingNumber+"\n"
                +streetName+"\n"+ cityName+", " +stateName+"\t"+zipCode);

        input.close();
    }
}
