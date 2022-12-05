package Day32_CustomClass_Constructors;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("Aaron");
        Employee employee2=new Employee("Ali",'M');
        Employee employee3=new Employee("Asli",'F',"QA");

        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);
        System.out.println("employee3 = " + employee3);

    }
}
