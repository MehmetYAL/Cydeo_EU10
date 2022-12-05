package Day30_CustomClass;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.setInfo("Mehmet",1903,'M',"QA",90000,true);
        System.out.println(employee1);

        Employee employee2=new Employee();
        employee2.setInfo("Mustafa",2545,'M',"QA",85000,true);

        Employee employee3=new Employee();
        employee3.setInfo("Lina",4523,'F',"developer",60000,false);

        Employee employee4=new Employee();
        employee4.setInfo("Ali",8512,'M',"Scrum Master",105000,true);

        Employee employee5=new Employee();
        employee5.setInfo("Veli",1112,'M',"Developer",99000,true);

        Employee[] employees={employee1,employee2,employee3,employee4,employee5};

        int countFulltime=0;
        int parttTime=0;
        double max=employees[0].salary;
        double min=employees[0].salary;
        for (Employee each : employees) {
            if (each.isFullTime){countFulltime++;}
            else {parttTime++;}

            if (each.salary>max){max=each.salary;}
            if (each.salary<min){min=each.salary;}

        }
        System.out.println("countFulltime = " + countFulltime);
        System.out.println("parttTime = " + parttTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
