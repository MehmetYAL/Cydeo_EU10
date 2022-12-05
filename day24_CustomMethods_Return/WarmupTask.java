package day24_CustomMethods_Return;

public class WarmupTask {
    public static void main(String[] args) {
initialsofThePerson("mehmet","yalcin");
domain("mehmet@gmail.com");
        System.out.println("----------------------------------------");
String[] moreEmails={"cydeo@gmail.com","woodenspoon@yahoo.com","javaisfun@hotmail.com"};
        for (String moreE : moreEmails) {
            domain(moreE);
            System.out.println("-------------------------");
            months(7);

        }

    }
    public static void initialsofThePerson(String name,String lastName){
         char first=name.toUpperCase().charAt(0);
         char last=lastName.toUpperCase().charAt(0);
        System.out.println(first+". "+last);
    }

    public static void domain(String email){
        String at=email.substring(email.indexOf('@')+1,email.lastIndexOf("."));
        System.out.println("domain is :"+ at);
    }

    public static void months(int monthNum) {
        String name="";
        if (monthNum > 0 && monthNum <= 12) {
           name= (monthNum==1)?"jan":(monthNum==2)?"feb":(monthNum==3)?"march":(monthNum==4)?"april":(monthNum==5)?"may":
            (monthNum==6)?"june":(monthNum==7)?"july":(monthNum==8)?"august":(monthNum==9)?"sept":(monthNum==10)?"oct":(monthNum==11)?"nov":"dec";

        }else {
            name=("invalid number");
        }
        System.out.println("name of the month is "+name);
    }
}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */