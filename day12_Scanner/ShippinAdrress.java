package day12_Scanner;

import java.util.Scanner;

public class ShippinAdrress {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your full name");
        String fullName=input.nextLine();

        System.out.println("enter your building number");
        String buildingNumber=input.next();
input.nextLine();
        System.out.println("enter your street name");
        String streetNumber=input.nextLine();

        System.out.println("enter your city name");
        String cityName=input.nextLine();

        System.out.println("enter your state");
        String state=input.next();

        System.out.println("enter your zip code");
        String zipCode=input.next();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetNumber = " + streetNumber);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        input.close();
    }
}
