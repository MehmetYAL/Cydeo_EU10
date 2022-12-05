package Day37_Inheritance.ScrumTask;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, char gender,  int id, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", id, salary, companyName);
    }

    public void analayz(){
        System.out.println(jobTitle+" "+name+ " is analyzing");
    }
}
