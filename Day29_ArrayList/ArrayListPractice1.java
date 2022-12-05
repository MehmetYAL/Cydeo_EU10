package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        String[] countries={"japan","korea","United States","Turkey","United Kingdom","Canada"};
        //convertinh Array to ArrayList
        ArrayList<String> list=new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p-> p.length()>=10);
        //converting ArrayList to Array
        countries=list.toArray(new String[0]);
        System.out.println(Arrays.toString(countries));

    }
}
/*
create on Arrray of string called countries
and than write a program that can remove all the country names have lenght of 10 oe greater
 */