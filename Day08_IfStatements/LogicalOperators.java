package Day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

String name= "Steven";
        int age = 19;
        String citizen="UK";
        boolean isEligible=age >=18 && citizen =="USA";
        System.out.println( name+" is eligible to vote:" + isEligible);
        System.out.println("----------------------------------------");

        String name2 ="josh";
        int creditScore= 715;
        int age2=23;
        int income = 40000;

        boolean isEligible2=creditScore>=720 && age2 >=23&& income >= 60000;
        System.out.println(name2 + " is eligible to have credit: "+ isEligible2);
        System.out.println("---------------------------");

String name3= "Shay";
int age3=21;
char gender = 'F';
boolean isEligible3 = age3>=18 && (gender == 'M'|| gender=='F');
            System.out.println(name3 + " is eligible to register: " + isEligible3);
        System.out.println("--------------------");

        String name4="James";

        String CountryOfBirth="UK";
        boolean marriedToUSCitizen=false;
         boolean isEligible4= CountryOfBirth == "USA" || marriedToUSCitizen==true;
        System.out.println(name4 + "is eligible to apply for US citizenShip:"+ isEligible4);
            System.out.println("--------------------------");

            String Student="Anna";
            double gpa=3.5;
            int familyInCome=60000;

            boolean isEligible5= gpa<=3.5 || familyInCome <=50000;
            System.out.println( Student + " is Eligible for scholarship: " + isEligible5);
            System.out.println("--------------------------------");

            boolean result2= true;
            System.out.println("result2 = " + result2);

            boolean result3=!result2;
            System.out.println("result3 = " + result3);
            System.out.println("-------------------");

            int score= 55;
            boolean passed=score >=60;
            boolean failed= !passed;
            System.out.println("passed = " + passed);
            System.out.println("failed = " + failed);













    }
}
