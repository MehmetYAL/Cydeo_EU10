package Day08_IfStatements;

public class nameOfDays {

    public static void main(String[] args) {
        //task write a program that can display the name of the month
//number =1~12
//task2 can display the name of the day
        //number=1~7
        // write aprogram that can print number of days in a month

        int number = 5;

        boolean has28Days= number ==2;
        boolean has30Days=number==4||number==6||number==9|| number==11;
        boolean has31Days= !has28Days&&!has30Days;// if the month does not have 28 days and 30days
        if(has28Days){
            System.out.println(" 28 days");
                    }
        if(has30Days) {

            System.out.println("30 days");
    }
        if(has31Days){
            System.out.println("31 days");
        }
}
}
