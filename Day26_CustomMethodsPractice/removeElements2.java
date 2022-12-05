package Day26_CustomMethodsPractice;

import Utulities.ArraysUtulitiy;

import java.util.Arrays;

public class removeElements2 {
    public static void main(String[] args) { int[] numbers={10,20,30,40,50};
        numbers=removeElement(numbers,2);
        System.out.println(Arrays.toString(numbers));

    }
                                         //1,2,3,4,3      4
    public static int[] removeElement(int[] array,int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("invalod index");
            System.exit(0);}
            int[] result = {};
            for (int i = 0; i < array.length; i++) {
                if (i != index) {
                    result = ArraysUtulitiy.addElement(result, array[i]);
                }

            }
            return result;
        }

    }