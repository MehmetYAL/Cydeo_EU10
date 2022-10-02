package day11_Switch_Scanner;

public class NumberOfDay {
    public static void main(String[] args) {
        int number=2;
        int year=2000;
        //int year=2000; what if we have another condition than we make one more condition
        if(number>=1&&number<=12){
            switch (number){
                case 2:
                    if (year%4==0) {
                        System.out.println("29 days");

                    } else {            System.out.println("28 days");}
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                    break;
                default://1-3-5-7-8-10-12 months
                    System.out.println("31 days");
            }


        }else {
            System.out.println("Invalid Number");
        }


    }
}
