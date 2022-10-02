package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius=input.nextDouble();
        double area=radius*radius*3.14;
        double perimeter=radius*2*3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        input.close();


    }
}
