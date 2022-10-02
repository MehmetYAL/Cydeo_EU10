package day10NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        /*
        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                result = "Excellent";
            } else if (grade >= 80) {result = "Great";}
             else if (grade >= 70) {result = "Good";}
              else if (grade >= 60) {result = "Passed";  }
        } else { result = "is invalid score";  }
            */
        int grade=85;
  String result=   (grade>=0&&grade<=100)?(grade>=90)?"Excellent":(grade>=80)?"Great":(grade>=70)?"Good":
             (grade>=60)?"Passed":"Failed":"Invalid Score";
        System.out.println("result = " + result);
        System.out.println("---------------------------------------------------------");
        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                result = "Excellent";
            } else if (grade >= 80) {result = "Great";}
            else if (grade >= 70) {result = "Good";}
            else if (grade >= 60) {result = "Passed";  }
        } else { result = "is invalid score";  }
        System.out.println(result);


    }
}
