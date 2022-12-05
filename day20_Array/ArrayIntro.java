package day20_Array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        //create variable that capable enough contain 5 names
        String[] mygroup=new String[5];
        //System.out.println(mygroup);---wrong hashcode

        mygroup[0]="Gunay";
        mygroup[1]="Neira";
        mygroup[2]="Suat";
        mygroup[3]="Hulya";
        mygroup[4]="Mikael";
        System.out.println(Arrays.toString(mygroup));

        System.out.println("=========================================================");

        String[] days={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        //index======== 0           1           2          3        4        5          6
        System.out.println(Arrays.toString(days));

        int number=5;
        if (number<1||number>7){
            System.err.println("invalid number");
            System.exit(0);
    }
        System.out.println(days[number-1]);
}
}
