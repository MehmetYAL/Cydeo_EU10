package Day26_CustomMethodsPractice;

import Utulities.ArraysUtulitiy;

import java.util.Arrays;

public class merge2Arrays2 {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={101,20,30,404,555};
        int[] array3=merge(array1,array2);
        System.out.println(Arrays.toString(array3));

    }
    public static int[] merge(int[] arr1,int[] arr2){
        int[] result={};
        for (int each : arr1) {
            result=ArraysUtulitiy.addElement(result,each);
                    }
        for (int each : arr2) {
            result=ArraysUtulitiy.addElement(result,each);

        }return result;
    }
}
