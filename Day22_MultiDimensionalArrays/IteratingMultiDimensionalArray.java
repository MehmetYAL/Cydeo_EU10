package Day22_MultiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

        int [][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        for (int i=0;i<arr2D.length;i++){// i burada index of single dimensional arrays, arrayi artiracak
            //System.out.println(Arrays.toString(arr2D[i]));// print each arrays in new line-her array i kendi icinde array
            //olarak ayirarak yeni bir satirda yazar
            for (int k = 0; k < arr2D[i].length; k++) {
                System.out.print(arr2D[i][k]+" ");//inner loop gives the index of elements in array
                //outer loop gives the index of array, bu sekilde loop lardaki harfleri kullandiginda
                // arraylerdeki elementleri cikarip tek sekilde topla-yazdirir..
            }

        }
    }
}
