package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" enter the current speed");
        int currentSpeed=input.nextInt();
        int speedLimit=55;
       int overLimit=(currentSpeed-speedLimit);
       if (overLimit>0){
           System.out.println("you re driving " + overLimit+ " mph over limit.Slow Down");
       }
input.close();
       
    }
}
