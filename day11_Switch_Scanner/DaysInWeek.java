package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        //long number=9; is not possible long
        //double float booleab is not accepted by switch
        //break used for eciting the switch
        //if we dont give the break it execute untill next break
        //default block if none of block match-- can be use only ones
        int number=9;
        /*if(number==1){System.out.println("Monday");}*/
        switch (number)//only can use if equal or not can not use with >=,, =>
        {case 1:  System.out.println("Monday");
            break;
            case 2:   System.out.println("Tuesday");
            break;
            case 3:      System.out.println("Wednesday");
            break;
            case 4:   System.out.println("Thursday");
            break;
            case 5:  System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;

            default://only gets executed if none of the case blocks are matching
                System.out.println("Invalid Number");

        }
    }
}
