package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char ch='B';
        String result="";
       /* switch (ch){
            case 'A':
                System.out.println( "Excellent");
                break;
            case 'B':
                System.out.println( "Great");
                break;
            case 'C':
                System.out.println( "Good");
                break;
            case 'D':
                System.out.println( "Passed");
                break;
            case 'F':
                System.out.println( "Failed");
                break;
            default:
                System.out.println("Invalid");

        */
        switch  (ch){
            case 'A':
                result="Excellent";
                break;
            case 'B':
                result=( "Great");
                break;
            case 'C':
                result=( "Good");
                break;
            case 'D':
                result=( "Passed");
                break;
            case 'F':
                result=( "Failed");
                break;
            default:
                result=("Invalid");


        }
        System.out.println(result);
    }
}
