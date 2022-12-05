package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Aaron","Ahmed","David","Shay"));
        //employees.removeIf(p-> p.equals("Ahmed")||p.equals("David")); bu method ahmet ve david siler digerleri kalir
        employees.retainAll(Arrays.asList("Ahmed","David"));//bu methodta ahmet ve davidi birakir digerlerini siler
        System.out.println(employees);
        System.out.println("=============================================================");


        String[] names={"Mary","Monica","Mehray","Musti","Sumeyra","Hasan","Beril","Alper"};
        ArrayList<String> list=new ArrayList<>(Arrays.asList(names));
        System.out.println(list);
        list.removeIf(p-> p.startsWith("M"));// veya list.removeIf(p-> p.charAt(0)==("M"));
        System.out.println(list);
        names=list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));


    }
}
