package day15_StringAnd_ForLoop;

public class FormatFullName {
    public static void main(String[] args) {

        /* Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)
                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL"
                         output:
                        Cydeo School*/
String FName="cyDEo";
String Lname="SCHOOL";

FName= (FName.substring(0,1).toUpperCase())+FName.substring(1).toLowerCase();
        System.out.println(FName);
        Lname=Lname.substring(0,1).toUpperCase()+Lname.substring(1,6).toLowerCase();
        System.out.println("FName = " + FName+"\n"+"Lname = "+Lname);
    }
}
