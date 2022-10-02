package day10NestedIf;
public class NestedIfIntro {


        public static void main(String[] args) {

                int score = 85;
                score = 125;// second line ineter change it the last variable

                if (score >= 0 && score <= 100) {
                        if (score >= 60) {
                                System.out.println("passed");

                        } else {
                                System.out.println("failed");
                        }
                } else
                        System.out.println("invalid");
                System.out.println("------------------------------------");


                {
                        int age = 25;
                        boolean hasId = false;
                        if (hasId) {
                                if (age >= 21) {
                                        System.out.println("Eligible to buy alcohol");
                                } else {
                                        System.out.println("Not eligible to buy alcohol ");
                                }
                        } else {
                                System.out.println("You must have Id to buy alcohol");
                        }
                }
                System.out.println("---------------------------------");

                int number = 5;// friday will write
                number=9;// invalid number will write
                if (number >= 1 && number <= 7) {//if the number is a valid number1~7
                         if (number == 1) {
                                System.out.println("Monday");
                        }
                          else if (number == 2) {System.out.println("Tuesday");}
                        else if (number == 3) {System.out.println("Wednesday");}
                         else if (number == 4) {System.out.println("Thrusday");}
                         else if (number == 5) { System.out.println("Friday"); }
                        else if (number == 6) {System.out.println("Saturday"); }
                }  else {//if number is not valid//
                         System.out.println("Invalid Number");
                         }


                } }
