package Day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
        //PERSON ELIGIBLE to buy alcholl#
        Scanner input=new Scanner(System.in);

       while (true){
        System.out.println("enter your age");
        int age=input.nextInt();

        while (!(age>=1&&age<=120)){
            System.out.println("Invalid entry, re enter your age");
            age= input.nextInt();
        }
        System.out.println("would you like to continue");
        String a= input.next().toLowerCase();
        while (!(a.equals("yes")||a.equals("no"))){//cevap gecersiz oldukca devam eder
            System.err.println("Invalid entry,re enter,would u like to continue");
            a= input.next().toLowerCase();
        }
        if (a.equals("no")){
            break;
        }input.close();

       }
       }


}
