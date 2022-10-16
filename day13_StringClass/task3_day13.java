package day13_StringClass;

public class task3_day13 {
    public static void main(String[] args) {
        String word1="cydeo";

        char first=word1.charAt(0);
        char last=word1.charAt(4);
        if (first==last){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }

    }
}
