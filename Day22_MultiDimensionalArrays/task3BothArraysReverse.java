package Day22_MultiDimensionalArrays;

import java.util.Arrays;

public class task3BothArraysReverse {
    public static void main(String[] args) {
        int [][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int k = arr2D[i].length - 1; k >= 0; k--) {
                System.out.print(arr2D[i][k]+" ");
            }
            System.out.println();
        }

    }
}
/*
12 11 10 9 8
7 6 5 4
3 2 1
 */