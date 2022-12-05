package day20_Array;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] numbers={10,9,7,8,67,12,5};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
