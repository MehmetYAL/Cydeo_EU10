package day10NestedIf;

public class day10_Practicetask_GradeLevel {
    public static void main(String[] args) {
        byte grade=2;
        String school="";
        if(grade>=1&&grade<=18){
            if (grade<=5){ school="Elemantary School";} else if (grade<=8) {
school="Middle School" ;} else if (grade<=12) {school="High school";}
            else if (grade<=16) {school="College"; }
            else if (grade<=18) {school="Grad School";}

        }else {school="Invalid grade";}
        System.out.println("school = " + school);

        }

        }


