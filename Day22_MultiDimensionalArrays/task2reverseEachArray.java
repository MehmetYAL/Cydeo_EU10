package Day22_MultiDimensionalArrays;

public class task2reverseEachArray {
    public static void main(String[] args) {
        int [][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for (int i = 0; i < arr2D.length; i++) {// i: index of each 1D arry started from 0
            for (int k = arr2D[i].length - 1; k >= 0; k--) {//k: index of each element start from last index
                System.out.print(arr2D[i][k]+" ");
            }
            System.out.println();
        }

        }
}
/*
task
321
7654
12 11 10 9 8
 */