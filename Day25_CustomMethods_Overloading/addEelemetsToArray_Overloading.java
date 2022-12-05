package Day25_CustomMethods_Overloading;

import java.util.Arrays;

public class addEelemetsToArray_Overloading {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};//70
        char[] chars={'b','r','h','a'};//x
        String[] names={"mehmet","ahmet","ayse","mustafa"};//kevin
        double[] array2={1.2,3.2};

      array=  addElement(array,7);
      chars=addElement(chars,'x');
      names=addElement(names,"kevin");
      array2=addElement(array2,101.5);
        System.out.println("names = " + Arrays.toString(names));
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("array2 = " + Arrays.toString(array2));


    }

    public static int[] addElement(int[] arr, int element) {
        int[] result = new int[arr.length + 1];
        int i = 0;
        for (int each : arr) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static double[] addElement(double[] arr, double element) {
        double[] result = new double[arr.length +1];
        int i = 0;
        for (double each : arr) {
            result[i++] = each;

        }result[i] = element;
        return result;

    }

    public static String[] addElement(String[] arr, String element) {
        String[] result = new String[arr.length + 1];
        int i = 0;
        for (String each : arr) {
            result[i++] = each;

        }
        result[i] = element;
        return result;


    }

    public static char[] addElement(char[] arr, char element) {
        char[] result = new char[arr.length + 1];
        int i = 0;
        for (char each : arr) {
            result[i++] = each;

        }
        result[i] = element;
        return result;


    }

}

