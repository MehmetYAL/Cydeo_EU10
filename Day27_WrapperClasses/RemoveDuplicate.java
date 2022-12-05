package Day27_WrapperClasses;

import Utulities.ArraysUtulitiy;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,3,3,3,4,4,5};
        arr=removeDuplicate(arr);
        System.out.println(Arrays.toString(arr));

    }
                              //{1,2,1,2,11,1,3,4,3}
    public static int[] removeDuplicate(int[] array){
        int[] result={};
        for (int each : array) {
            if (!ArraysUtulitiy.contain(result,each)){
                result=ArraysUtulitiy.addElement(result,each);
            }

        }return result;

    }
    public static double[] removeDuplicate(double[] array){
        double[] result={};
        for (double each : array) {
            if (!ArraysUtulitiy.contain(result,each)){
                result=ArraysUtulitiy.addElement(result,each);
            }

        }return result;

    }
    public static char[] removeDuplicate(char[] array){
        char[] result={};
        for (char each : array) {
            if (!ArraysUtulitiy.contain(result,each)){
                result=ArraysUtulitiy.addElement(result,each);
            }

        }return result;

    }
    public static String[] removeDuplicate(String[] array){
        String[] result={};
        for (String each : array) {
            if (!ArraysUtulitiy.contain(result,each)){
                result=ArraysUtulitiy.addElement(result,each);
            }

        }return result;

    }



}
