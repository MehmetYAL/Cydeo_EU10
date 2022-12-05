package Day22_MultiDimensionalArrays;

import java.util.Arrays;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {
        int [][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for (int i = arr2D.length - 1; i >= 0; i--) {//i:index number of 1D arrays starting from last index to zero

            //arr2D[i];
            for (int k = 0; k < arr2D[i].length; k++) {//k:index number of elements starting from 0 to last index
                System.out.print(arr2D[i][k]);

            }
            System.out.println();
        }
        //System.out.println(Arrays.toString(new String[]{result}));


    }
}
/*
task
8 9 10 11 12
4 5 6 7
1 2 3
 */