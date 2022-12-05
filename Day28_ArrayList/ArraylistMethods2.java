package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println("list = " + list);
        int num=1;//int verildiginde idex numarasini dikkate alip remove eder
        list.remove(num);
        System.out.println("list = " + list);
        Integer num2=200;// eger Integer verirsek index degil verilen veriyi dikkate alir
        //burada arraylistteki 200 u siler
        //Integer num2=1500; if non primitive object is not exist tha boolean return false
        //list.remove(num2);
        boolean r=list.remove(num2);
        System.out.println("list = " + list);
        System.out.println("r = " + r);
        System.out.println("=============================================" );
        //clear() method is remove all the elements in ArrayList and size become zero
        list.clear();
        System.out.println(list.size());
        System.out.println("=========================================================");
        //indexOf(Data) --returns the first matching  element from ArrayList
        //lastIndexOf(Data) --returns the last matching  element from ArrayList
        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
      int a=  characters.indexOf('A');
        int b=characters.lastIndexOf('A');
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("======================================================================");
//contains() method returns true if the element contains in the arrayList, otherwise returns false
        boolean r2=characters.contains('A');
        System.out.println(r2);
        boolean r3=characters.contains('Z');
        System.out.println(r3);
        System.out.println("==================================================");

        //equals()method karsilastirir ve true yada false verir esitlik durumuna gore
        // ayni sayida element ve ayni object element
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);
        System.out.println(list1==list2);
        System.out.println(list1.equals(list2));
        System.out.println("==============================================================");
      //isEmpty() if ArrayList size is zero true otherwise is false
      boolean r4=list1.isEmpty();
        System.out.println("r4 = " + r4);
        list1.clear();
        boolean r5=list1.isEmpty();
        System.out.println("r5 = " + r5);
        System.out.println("======================================");

        ArrayList<Integer> numbers=new ArrayList<>();
        //Bulk Operatain:Collection Type
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(numbers);

    }
}
