package Day25_CustomMethods_Overloading;

import Utulities.ArraysUtulitiy;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        ArraysUtulitiy.printEachElements(arr1);
        System.out.println("======================================");

        double[] arr2={1.5,2.5,3.5};
        ArraysUtulitiy.printEachElements(arr2);
        System.out.println("--------------");

        char[] arr3={'A','B','C','D'};
        ArraysUtulitiy.printEachElements(arr3);
        System.out.println("======================");

          String[] arr4={"java","python","cydeo","MT"};
        ArraysUtulitiy.printEachElements(arr4);
        System.out.println("-------------------------");

        int[] n1={1,2,3,4,5};
        int max1=ArraysUtulitiy.max(n1);
        System.out.println("max1 = " + max1);
        System.out.println("------------------------" );
        double[] n2={2.3,3.5,5.9};
        double max2=ArraysUtulitiy.max(n2);

        System.out.println("max2 = " + max2);

        System.out.println("============================");
        int[] a1={1,2,3,4,5};
        boolean r1=ArraysUtulitiy.contain(a1,9);
        System.out.println("r1 = " + r1);
        System.out.println("=====================================");



    }
}
