package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Mehmet";
        String lastName = "CYDEO";
        String fullName = firstName + " " + lastName;
        int age = 45;
        String company = "Apple";
        String jobTitle = "SDET";
        double salary = 100_000.08;



        System.out.println("My name is " + firstName +" " + lastName);
        System.out.println(fullName);
        System.out.println("Full name of the person is " + fullName );
        System.out.println("Full name of the person is " + fullName + ", and " +  fullName + " is " + age + " years old. " );
        System.out.println(fullName + " is " + jobTitle + ", " + fullName + " works at "
                + company +". his/her salary " + salary );


    }
}
