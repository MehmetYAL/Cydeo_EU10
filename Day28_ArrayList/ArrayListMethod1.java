package Day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        // add method use for adding element
        //her add methodla element eklendiginde array size yenilenir ve cagirilan element
        // array size eklenir..
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("numbers = " + numbers);
        //bi element eklemek istedigimizde eklemek istedigimis index no yazilir ve
        // sonra eklenecek element yazilir,yazilan indexten sonrasina ekler..
        numbers.add(2,25);
        System.out.println("add element numbers = " + numbers);
        System.out.println("=====================================");
        //size method, gives total number of element/size
        System.out.println(numbers.size());
        int lastIndex=numbers.size();
        System.out.println("lastIndex = " + lastIndex);

        //get() method-- get the single element
        int num=numbers.get(3);// get element on the index of 3
        System.out.println("num = " + num);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));}
            System.out.println("====================================");
      //set() method verilen indexteki elementi verilen element ile degistirir
//replace the eleement to given size
      ArrayList<String> list=new ArrayList<>();
      list.add("Java");
      list.add("Python");
      list.add("Java");
      list.add("C#");
      list.add("Ruby");
list.set(2,"JavaScript");
list.set(3,"C++");
            System.out.println(list);
        System.out.println("==================================================");
        ArrayList<String> employees=new ArrayList<>();
        //remove(int index) method is given index number is romeve the from arraylist
        employees.add("suat");
        employees.add("aygun");
        employees.add("olga");
        employees.add("neira");
        employees.add("ali");
        employees.add("hulya");
        employees.add("kaloyan");
        System.out.println("employees = " + employees);

        employees.remove(0);
        System.out.println("employees = " + employees);
        employees.remove(0);
        System.out.println("employees = " + employees);
        // to remove last index element
        employees.remove(employees.size()-1);
        System.out.println("employees = " + employees);
        
        // to remove element index degilde element ismini yazarak remove yapmak icin
        // remove(object) cagirilir
        employees.remove("ali");
        System.out.println("employees = " + employees);
        boolean r1=employees.remove("hulya");
        System.out.println("employees = " + employees);
        System.out.println("r1 = " + r1);



    }
}
