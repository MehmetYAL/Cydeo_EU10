package Day26_CustomMethodsPractice;

import java.util.Arrays;

public class merge2Arrays {
    public static void main(String[] args) {
int[] array1={1,2,3,4,5};
int[] array2={10,20,30,40,50};
int[] array3=merge(array1,array2);
        System.out.println(Arrays.toString(array3));
        String[] str1={"ahmet","mehmet","mustafa","ali"};
        String[] str2={"football","basket","swim"};
        String[] str3=merge(str1,str2);

        System.out.println(Arrays.toString(str3));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int j = 0;
        for (int each : arr1) {
            result[j++] = each;
        }
        for (int each : arr2) {
            result[j++] = each;

////this also possible but we solve it with different solution
        }
        return result;
    }
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = new double[arr1.length + arr2.length];
        int j = 0;
        for (double each : arr1) {
            result[j++] = each;
        }
        for (double each : arr2) {
            result[j++] = each;

////this also possible but we solve it with different solution
        }
        return result;
    }
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = new char[arr1.length + arr2.length];
        int j = 0;
        for (char each : arr1) {
            result[j++] = each;
        }
        for (char each : arr2) {
            result[j++] = each;

////this also possible but we solve it with different solution
        }
        return result;
    }
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = new String[arr1.length + arr2.length];
        int j = 0;
        for (String each : arr1) {
            result[j++] = each;
        }
        for (String each : arr2) {
            result[j++] = each;

////this also possible but we solve it with different solution
        }
        return result;
    }


}