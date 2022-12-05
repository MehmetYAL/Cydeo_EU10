package Day27_WrapperClasses;

import java.util.Arrays;

public class replace {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        arr=replace(arr,2,30);
        System.out.println(Arrays.toString(arr));
        System.out.println("===========================");

        String[] str={"java","python","scrum","agile"};
        str=replace(str,1,"tester");
        System.out.println(Arrays.toString(str));
    }
   /* Create a method named replace that passes three parameters:
    integer array, integer index, integer newElement.
    The method replaces the element of the array at given index with the new element,
    and returns the new array.
           Ex: arr = {1,2,3,4,5};
    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}*/

    //replace the elements of the array at given index with the new elements
       public static int[] replace(int[] arr, int index, int mewElement) {
    if (index<0||index> arr.length){
        System.out.println("invalid index "+index);
        System.exit(0);    }
    arr[index]=mewElement;
    return arr;
}
    public static double[] replace(double[] arr, int index, double mewElement) {
        if (index<0||index> arr.length){
            System.out.println("invalid index "+index);
            System.exit(0);    }
        arr[index]=mewElement;
        return arr;
    }
    public static char[] replace(char[] arr, int index, char mewElement) {
        if (index<0||index> arr.length){
            System.out.println("invalid index "+index);
            System.exit(0);    }
        arr[index]=mewElement;
        return arr;
    }
    public static String[] replace(String[] arr, int index, String mewElement) {
        if (index<0||index> arr.length){
            System.out.println("invalid index "+index);
            System.exit(0);    }
        arr[index]=mewElement;
        return arr;
    }


}
