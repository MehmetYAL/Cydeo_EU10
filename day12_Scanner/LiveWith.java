package day12_Scanner;

import java.util.Scanner;

public class LiveWith {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many people you live with");
        int people=input.nextInt();

        if (people<3){
            System.out.println("Live with less than 3 people ");}
        else if (people<=6) {
            System.out.println("Live with 3 - 6 people"); }
        else {
            System.out.println("Live with more than 6 people");
        }
input.close();

    }
}
