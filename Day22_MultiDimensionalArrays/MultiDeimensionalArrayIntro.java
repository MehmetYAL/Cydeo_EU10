package Day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDeimensionalArrayIntro {
    public static void main(String[] args) {
        String[] name1={"ahmet","mehmet","hasan"};
        String[] name2={"john ","jack","james"};
        String[] name3={"Tahmet","Mmehmet","Hhasan"};
        String[][] groups=new String[3][];//index:0,1,2
        groups[0]=name1;
        groups[1]=name2;
        groups[2]=name3;
   //     System.out.println(Arrays.toString(groups)); this print method is only for one Array to print
        System.out.println(Arrays.deepToString(groups));//to multiple Arrays print
        System.out.println("------------------------------------------------------------------");
    //index of the elements 0 1 2   0 1 2 3   0 1 2 3 4 5
           int [][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};//index number 3 index contains
           //   index         0        1          2

        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[2][3]);


    }
}
