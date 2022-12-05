package Day32_CustomClass_Constructors;

public class Employee {
    public String name;
    public char gender;
    public String jibTitle;
    public double salary;

    public Employee (String name){
        this.name=name;
    }
    public Employee(String name,char gender){
       // this.name=name; ayni constroctor yazilicaksa method ismi ile cagirilir
        //constructor can not be call by its name should use this(here);
        this(name);
        this.gender=gender;
    }
    public Employee(String name,char gender,String jobTitle){
        this(name,gender);
        this.jibTitle=jobTitle;
    }
    public Employee(String name,char gender,String jibTitle,double salary){
        this(name,gender,jibTitle);
        this.salary=salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jibTitle='" + jibTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


}
