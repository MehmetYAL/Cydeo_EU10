package Day26_CustomMethodsPractice;

import Utulities.ArraysUtulitiy;

import java.util.Arrays;

public class uniqueElement {
    public static void main(String[] args) {
int[] array={1,1,2,3,3,3,4,5,66,7,7};
int[] unique=uniqueElement(array);
        System.out.println(Arrays.toString(unique));
        double[] array2={1.1,2.5,3.5,5.7,1.1};
        double[] unique2=uniqueElement(array2);
        System.out.println(Arrays.toString(unique2));
    }
    
    //returns the unique elements of the array as a new array
    public static int[] uniqueElement(int[] array){
        int[] result={};//burada int te hic element olmadigini(bos) belirtir bunun uzerinden islem yapilir
        for (int each : array) {
            if (ArraysUtulitiy.frequeancyOfElement(array,each)==1){
                //if the frequency is one,the element is unuque
                result=ArraysUtulitiy.addElement(result,each);
            }
        }return result;
    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElement(double[] array){
        double[] result={};//burada double te hic element olmadigini(bos) belirtir bunun uzerinden islem yapilir
        for (double each : array) {
            if (ArraysUtulitiy.frequeancyOfElement(array,each)==1){
                //if the frequency is one,the element is unuque
                result=ArraysUtulitiy.addElement(result,each);
            }

        }return result;
    }

    public static char[] uniqueElement(char[] array){
        char[] result={};//burada int te hic element olmadigini(bos) belirtir bunun uzerinden islem yapilir
        for (char each : array) {
            if (ArraysUtulitiy.frequeancyOfElement(array,each)==1){
                //if the frequency is one,the element is unuque
                result=ArraysUtulitiy.addElement(result,each);
            }
        }return result;
    }

    public static String[] uniqueElement(String[] array){
        String[] result={};//burada int te hic element olmadigini(bos) belirtir bunun uzerinden islem yapilir
        for (String each : array) {
            if (ArraysUtulitiy.frequeancyOfElement(array,each)==1){
                //if the frequency is one,the element is unuque
                result=ArraysUtulitiy.addElement(result,each);
            }
        }return result;
    }
}
