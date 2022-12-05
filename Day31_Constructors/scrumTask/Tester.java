package Day31_Constructors.scrumTask;

public class Tester {

    public String name;
    public int emlpyeeId;
    public String jobTitle;
    public double salary;

    public Tester(String name, int emlpyeeId, String jobTitle, double salary) {
        this.name = name;
        this.emlpyeeId = emlpyeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                "emplyee id='" + emlpyeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $ " + salary +
                '}';
    }

    public void smokeTesting() {
        System.out.println(name + "is smoke testing");
    }

    public void creatingTicket() {
        System.out.println(name+" creating ticket");
    }

}


/*
create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary
	        Add A constructor that can set all the fileds
	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()
 */