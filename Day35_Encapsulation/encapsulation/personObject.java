package Day35_Encapsulation.encapsulation;

public class personObject {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("Mehmet");
        p1.setAge(46);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}
