package Day34_GarbageCollection_AccessModifiers;

import Day31_Constructors.Student;
import Day32_CustomClass_Constructors.Car;
import Day33_CustomClass_Statics.Iphone;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

        public static void main(String[] args) {
/*
         String str=null;
    non primitive can be sent to garbage with null
  */
            String str="Wooden spoon";// after line 10 wooden spoon will be eligible for garbage collection
            str=null;
            Car car1=new Car("Toyota");
            car1=null;
            System.out.println(car1);
            System.out.println("----------------------------------");
            // when you assign to object to second times first object is eligible for garbage
            String language="Python";
            language="Java";
            System.out.println(language);
            System.out.println("===================================");

            ArrayList<Integer> list1=new ArrayList<>();
            list1.add(100);

            ArrayList<Integer> list2=list1;
            System.out.println(list2);
            list2.addAll(Arrays.asList(100,200,300));

            System.out.println(list1);
            System.out.println(list2);

            System.out.println(list1==list2);
            System.out.println("-------------------------------------------------------");

            Student student1=new Student("Mehmet",23,'m','a',123);
            student1.grade='B';
            Student student2=student1;
            System.out.println(student1);
            System.out.println(student2);

        }
}
