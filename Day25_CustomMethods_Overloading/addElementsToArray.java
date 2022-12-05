package Day25_CustomMethods_Overloading;

import java.util.Arrays;

public class addElementsToArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int num = 5;
        array = addInteger(array, num);
        System.out.println(Arrays.toString(array));
        System.out.println("------------------------");
        double[] arr2 = {1.0, 2.0, 3.0};
        double num2 = 4.0;
        System.out.println(Arrays.toString(addDouble(arr2, num2)));
        System.out.println("=========================================================");

        String[] names = {"ahmet", "mehmet", "mustafa", "ali"};//"kadir

        names = addString(names, "Neira");
        System.out.println(Arrays.toString(names));

        System.out.println("---------------------------------------------");

        char[] chars = {'A', 'B', 'C', 'D' };
        chars = addchar(chars, 'E');
        System.out.println(Arrays.toString(chars));
    }

    public static int[] addInteger(int[] arr, int element) {
        int[] result = new int[arr.length + 1];
        int i = 0;
        for (int each : arr) {
            result[i++] = each;

        }
        result[i] = element;
        return result;
    }

    public static double[] addDouble(double[] arr, double element) {
        double[] result = new double[arr.length + 1];
        int i = 0;
        for (double each : arr) {
            result[i++] = each;

        }result[i] = element;
        return result;

    }

    public static String[] addString(String[] arr, String element) {
        String[] result = new String[arr.length + 1];
        int i = 0;
        for (String each : arr) {
            result[i++] = each;

        }
        result[i] = element;
        return result;


    }

    public static char[] addchar(char[] arr, char element) {
        char[] result = new char[arr.length + 1];
        int i = 0;
        for (char each : arr) {
            result[i++] = each;

        }
        result[i] = element;
        return result;


    }

}
/*
Task2:
		1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}
	    2. create a return method called addDouble that can add a double after the last index of a double array
	    3. create a return method called addString that can add a String after the last index of a String array
	    4. create a return method called addChar that can add a char after last index of a char array

 */