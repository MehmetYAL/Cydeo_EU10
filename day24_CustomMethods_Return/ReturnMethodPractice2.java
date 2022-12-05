package day24_CustomMethods_Return;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {
        String str = grade(85);
        if (str.equals("A")) {
            System.out.println("excelent");
        } else if (str.equals("B")) {
            System.out.println("great");

        } else if (str.equals("C")) {
            System.out.println("good");
        } else if (str.equals("D")) {
            System.out.println("passed");
        } else {
            System.out.println("try again");
        }
    }       //create a function chek the gray
    public static String grade(int score){
        String result="";
    if (score<0||score>100){
        result="invalid";
    }else {
        result=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
    }return result;

    }






}
