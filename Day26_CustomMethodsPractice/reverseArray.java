package Day26_CustomMethodsPractice;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,55};

        int[] result=revere(arr);
        System.out.println(Arrays.toString(result));
    }
    //reverse the given array, returns a new array
    public static int[] revere(int[] array){
        int[] result=new int[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];

        }return result;
    }
    public static String[] revere(String[] array){
        String[] result=new String[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];

        }return result;
    }  
    public static char[] revere(char[] array){
        char[] result=new char[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];

        }return result;
    }
    public static double[] revere(double[] array){
        double[] result=new double[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];

        }return result;
    }



}
