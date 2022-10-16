package day13_StringClass;

import java.util.Scanner;

public class task5_day13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.nextLine();

        scan.close();

        int length = word.length();
        String result = "";

        if(length == 0){
            result = "Empty";
        } else if (length > 3){
            int lastIndex = word.length() - 1;
            result = ""+ word.charAt(length - 3)+ word.charAt(length - 2)+ word.charAt(length - 1);
        }else {
            result = word;
        }

        System.out.println(result);

    }
}
