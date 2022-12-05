package Day33_CustomClass_Statics;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.name="mehmet";

        Employee employee2=new Employee();
        employee2.name="Yalcin";

        //Employee employee3=new Employee();
        System.out.println(employee1.name);
        System.out.println(employee2.name);
    }
}
