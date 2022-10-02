package day12_Scanner;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        int grade=45;
        String school="";
        switch (grade){
            case 1: case 2: case 3: case 4: case 5: school="Elemantary School";
            break;
            case 6: case 7: case 8: school="Middle School";
            break;
            case 9: case 10: case 11: case 12: school="High School";
                break;
            case 13: case 14: case 15: case 16: school="College";
                            break;
            case 17: case 18:  school="Grade";
                break;
            default:
                System.out.println("Invalid ");

        }System.out.println(school);
        System.out.println("----------------------------------------");

byte number=4;
String result="";
if (number>=1&&number<=18){
    switch (number){
        case 6: case 7: case 8: school="Middle School";
            break;
        case 9: case 10: case 11: case 12: school="High School";
            break;
        case 13: case 14: case 15: case 16: school="College";
            break;
        case 17: case 18:  school="Grade";
            break;
        default:result="Elemantary scool";

    }}else {result="Invalid Grade";}
    System.out.println(result);



}

    public static class MilesToKm {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("enter miles");
            double miles=input.nextDouble();
            double km= miles*1.609;
            System.out.println(miles+ " miles equal to "+km+ " kilometers");
            input.close();

        }
    }
}
