package Day31_Constructors.scrumTask;

import java.util.ArrayList;

public class MyScrumTeam {
    public static void main(String[] args) {
        Tester tester1=new Tester("Mehmet",1976,"QA",99000);
        Tester tester2=new Tester("Kevin",1990,"QA",110000);
        Tester tester3=new Tester("Lala",1995,"QA",105000);
        Tester tester4=new Tester("Ali",1985,"QA",125000);

        Tester[] testers={tester2,tester3,tester4};

        Developer developer1=new Developer("Olga",223,"Java Dev",150000);
        Developer developer2=new Developer("Bill",245,"Java Master",2000000);
        Developer developer3=new Developer("Mustafa",339,"Software Dev",200000);
        Developer developer4=new Developer("Alper",257,"Senior Dev",225000);

        Developer[] developers={developer2,developer3,developer4};

        ScrumTeam scrum=new ScrumTeam("Niagara","Huseyin","Neira",14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);
        System.out.println("======================================================================");

        for (Tester eachTester:scrum.testersList  ) {
            System.out.println(eachTester.name+" : "+eachTester.salary);
        }
        System.out.println("===================================");
        for (Developer eachDeveloper : scrum.developersList) {
            System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);

        }
        System.out.println("==================================================");

        scrum.removeDeveloper(245);
        System.out.println(scrum);
       tester1.smokeTesting();


    }
}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team

 */