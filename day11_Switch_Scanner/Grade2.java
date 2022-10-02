package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char ch='B';
        String result="";
        /* if the frade a b c  or d sgould write Passed otherwise print FAILED*/
        switch (ch) {
            case 'A': case  'B': case 'C': case 'D':
                result="Passed";
                break;
            case 'F': result="Failed";
            break;
            default:
                result=("Invalid");

        }System.out.println(result);
    }
}
