package Day17_While_DoWhile_LoopPractice;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {
        for (char i = 'A'; i <='Z' ; i++) {
            if (i=='F'){break;//statement ends
            }
            System.out.print(i);
        }
        System.out.println("--------------------");
        System.out.println("----------------------");
        Scanner input=new Scanner(System.in);
while(true){
    System.out.println("enter a number");
    int number= input.nextInt();
    if (number<0){
        break;
    }
}


input.close();
    }
}
