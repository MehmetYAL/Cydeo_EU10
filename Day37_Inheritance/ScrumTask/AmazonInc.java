package Day37_Inheritance.ScrumTask;

public class AmazonInc {
    public static void main(String[] args) {
        String company="Amazon Inc";

        ProductOwner po=new ProductOwner("Mehmet",45,'M',123,95000,company);
        BusinessAnalyst ba=new BusinessAnalyst("Ali",30,'M',2323,85000,company);
        ScrumMaster sm=new ScrumMaster("Bahar",35,'F',456,89000,company);

        Tester tester1=new Tester("Rabia",29,'F',"QA",654,80000,company);
        Tester tester2=new Tester("Ali",39,'M',"QAengeneer",659,80000,company);
        Tester tester3=new Tester("Mustafa",49,'M',"QA Chief",1654,89000,company);
        Tester tester4=new Tester("Yasemin",34,'F',"SDET",2301,81000,company);
        Tester[] testers={tester1,tester2,tester3,tester4};

        Developer developer1=new Developer("Daniel",35,'F',"Java Developer",89,95000,company);

        ScrumTeam scrumTeam=new ScrumTeam(po,ba,sm);
        scrumTeam.addDevelopers(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("========================================================================================");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name+" salary is "+ tester.salary);

        }


    }
}
