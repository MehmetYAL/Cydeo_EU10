package day10NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        /*
        90~100 excelent
        80~89 great
        70~79 good
        60~69 passed
        0~59 failed
         */

        int grade = 95;// excelent shoul be write

        grade = 120; // is invalid score should be write
        String result = "";
        /*if (grade>=0&&grade<=100){
            if (grade>=90){System.out.println("Excellent");}
            else if(grade>=80){System.out.println("Great");}
            else if(grade>=70){System.out.println("Good");}
            else if(grade>=60){System.out.println("Passed");}




        }else {
            System.out.println("is invalid score");

    }
*/

        System.out.println("---------------------");
/* if you dont want to use every line the statement than like below but at the and should make
        one last statement*/
        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                result = "Excellent";
            } else if (grade >= 80) {
                result = "Great";
            } else if (grade >= 70) {
                result = "Good";
            } else if (grade >= 60) {
                result = "Passed";  }

        } else { result = "is invalid score";  }

        System.out.println("result = " + result);
    }
}