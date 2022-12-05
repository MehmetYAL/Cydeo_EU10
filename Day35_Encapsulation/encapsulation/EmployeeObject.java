package Day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("",'w',46,-25000);
        System.out.println(employee1);
        //employee1.age="Ali"; can not call it like this
        employee1.setName("Ali");
        System.out.println(employee1);
        Employee employee2=new Employee("murat",'M',35,12000);
        employee2.setSalary(employee2.getSalary()+2500);
        System.out.println(employee2);
    }
}
