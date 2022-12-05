package day19_Recap_Loops_String;

import day12_Scanner.ScannerPractice;

import java.util.Scanner;

public class day19_T4_GradeCalculater {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

      while (true) {
          System.out.println("enter your score");
          int score= input.nextInt();
          if (score>100||score<0){
              System.out.println("invalid entry re enter your score");
              System.exit(0);
          }
          if (score >= 0 && score <= 100) {
              if (score >= 90 && score <= 100) {
                  System.out.println("A");
              } else if (score >= 80 && score < 90) {
                  System.out.println("B");
              } else if (score >= 70 && score < 80) {
                  System.out.println("C");
              } else if (score >= 60 && score <= 70) {
                  System.out.println("D");
              } //else if (score >= 0 && score < 60) {
                 // System.out.println("F");
             // }
              else   {System.out.println("F");
              }
          }

          System.out.println("would you like to continue");
          String answer = input.next().toLowerCase();
          while (!(answer.equals("yes")||answer.equals("no")))  {
              System.out.println("invalid entry, re enter the score");
              answer= input.next().toLowerCase();}

          if (answer.equals("no")){
              System.out.println("have a nice day");
              break;
          }
      }
    }
}
