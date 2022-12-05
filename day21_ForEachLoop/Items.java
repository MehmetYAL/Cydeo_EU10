package day21_ForEachLoop;

import java.util.Arrays;

public class Items {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods",
                "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,
                439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,
                12350};
     /*   String[] ItemName=new String[items.length];
        for (String s : ItemName) {
            System.out.println(s.substring(0,s.length()-1));
        }*/


       System.out.println(Arrays.toString(items));

    }
}
/*
find out the first index number of "Gloves"
2. find out if "iPad" is contained in the item list
3. Print the report of each shopping item
name - price - #ID
 */