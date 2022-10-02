package day04_Variables;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class EmployeeInfo {
    public static void main(String[] args) {

        //1employeeName(string2age(int3gender(char
        // 4company(string 5jobtitle(string 6yearsOfExperience(double
        // 7salary(int 8isFullTime(boolean
        //9isMarried(boolean 10employeedId(boolean

        String employeeName = "Mehmet";
                int age = 40;
                char gender = 'M';
                String company = "Apple Inc";
                String jobTitle ="SDET";
                double yearsOfExperience= 2.5;
                int salary = 120000;
                boolean isFullTime = true;
                String isEmployeeID = "A101";
                boolean isMarried = true;
                String SSN = "123-45-6789";

        System.out.println("employeeName = " + employeeName);
        System.out.println("SSN = " + SSN);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("company = " + company);
        System.out.println(company);
        System.out.println(SSN);





    }
}
