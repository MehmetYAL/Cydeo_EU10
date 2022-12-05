package day20_Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[] letter=new char[26];

      /*  for (char i = 'A',k=0; i <='Z'&&k<letter.length ; i++,k++) { boylede yazilabilir
            letter[k]=i;
        }*/

       char ch='A';

        for (int i = 0; i < letter.length ; i++) {
            letter[i]=ch;
            ch++;
        }


        System.out.println(Arrays.toString(letter));


        System.out.println("------------------------------------------------------------------------------------------");

        /*

         */
    }
}
