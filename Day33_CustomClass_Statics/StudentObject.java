package Day33_CustomClass_Statics;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student("Mehmet");
        Student student2=new Student("Ali",'F');
        Student student3=new Student("Ayse",123);
        Student student4=new Student("Kamil",345,'A');
        Student student5=new Student("Hulya",'F',35);
        Student student6=new Student("Recep",'M',30,548);
        Student student7=new Student("Melih",'M',22,789,'A');

        //System.out.println(student1==student2);
        Student[] students={student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));


        //System.out.println(student1);
    }
}
