package Day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDeimensionalArray2MoreThan3Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //3dimensional contains2 D arrays
        //                        0       1           2              0            1          2
        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}};
        //                            0                                     1
        //[index num of 2DArray] [index of 1D Array][index number of elements]
        System.out.println(Arrays.deepToString(arr3D));// all 3d
        System.out.println(Arrays.deepToString(arr3D[1]));// last index of 3D -[[10, 20, 30], [40, 50, 60], [70, 80, 90]]
        System.out.println(Arrays.toString(arr3D[1][1]));// 3 D deki last indexin deki 2elementlerini aldi
        System.out.println(arr3D[0][2][2]);//9 u elde etmek icin

        for (int[][] each2D : arr3D) {
            for (int[] each1D : each2D) {
                for (int element : each1D) {
                    System.out.print(element);
                }
                System.out.println();

            }

        }
        System.out.println("-------------------------------------------------------------");
        
        int[][][][] arr4D={ {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}} };
        
        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int element : each1D) {
                        
                    }
                    
                }
                
            }
            
        }
                


    }
}