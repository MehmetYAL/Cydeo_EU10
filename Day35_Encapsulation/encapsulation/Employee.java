package Day35_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        setSalary(salary);

    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.out.println("invalid gender");
            return;
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            return;
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 1) {
            return;
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            return;
            // System.out.println("invalid type");
            // System.exit(0);

        }
        this.name = name;

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
/*
Create an Employee Class:
			private variables:
				name, gender, age, salary

			Encapsulate all the private fields

				1. Name can not be empty
				2. gender can not anything other than female or male
				3. age can not be less than 16, and greater than 90
				4. salary can not be zero or negative
 */