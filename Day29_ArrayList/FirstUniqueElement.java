package Day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println(list);
        //int freq= list.get(0);
        for (Integer each : list) {
int frequancy=0;

            for (Integer element : list) {
                if (element ==each)
                {frequancy++;}

            }if (frequancy==1){
            System.out.println(each);
            break;
            }
        }

    }
}
/*
. Write a program that can return the first unique elements from an arraylist

			Do not use indexOf & lastIndexOf methods

 */