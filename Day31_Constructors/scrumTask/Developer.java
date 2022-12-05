package Day31_Constructors.scrumTask;

public class Developer {
    public String name;
    public int emlpyeeId;
    public String jobTitle;
    public double salary;

    public Developer(String name, int emlpyeeId, String jobTitle, double salary) {
        this.name = name;
        this.emlpyeeId = emlpyeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;

}

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", emlpyeeId=" + emlpyeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+"is coding");
    }

    public void unitTesting(){
        System.out.println(name+" is unit testing");
    }
    public void fixingBug(){
        System.out.println(name+ "is fixing bug");
    }
}
/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */