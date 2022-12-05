package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6}; //retrun reverese{1,2,3,4,5,6};
        int[] reverse=new int[array.length];
        int res=0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[res++]=array[i];

        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("==============================================");

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer> reverseList=new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--) {
int each= list.get(i);
reverseList.add(each);

        }System.out.println(reverseList);
    }
}
