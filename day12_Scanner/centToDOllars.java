package day12_Scanner;

import java.util.Scanner;

public class centToDOllars {
    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
        System.out.println("enter how much cents you have");
        int cents=input.nextInt();
        int dollars=(cents/100);
        int cent=(cents%100);
        System.out.println(cents+ " cents equal to: "+dollars+" dollars and "+cent+ " cents");

}
}
