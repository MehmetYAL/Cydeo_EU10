package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> unique=new ArrayList<>();
        for (Integer each : list) {
            int freq=Collections.frequency(list,each);//find the frequency of each element
            if (freq==1){
                unique.add(each);
            }

        }
        System.out.println(unique);
        System.out.println("======================================");
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));
        ArrayList<Integer> unique2=new ArrayList<>(list2);//add all the elements of list2
        unique2.removeIf(p-> Collections.frequency(list2,p)>1);//remove all the elemets frequency is more than 1
        System.out.println(unique2);


    }
}
