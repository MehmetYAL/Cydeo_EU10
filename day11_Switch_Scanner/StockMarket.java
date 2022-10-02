package day11_Switch_Scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many total shares do you have already?");
        int totalShares=input.nextInt();

        System.out.println("How much total value in the stock market is?");
        double totalValue=input.nextDouble();
        input.nextLine();

        System.out.println(" enter the name of the co" +
                "mpany do you have the most shares?");
        String nameOfCompany=input.nextLine();

        System.out.println("Your total stock market holding is $ " +totalValue+
                " which is made up of " + totalShares+ " shares. "+nameOfCompany+" is your company holdings");


input.close();


    }
}
