package Day26_CustomMethodsPractice;

import Utulities.ArraysUtulitiy;

public class reverseArray2 {
    public static void main(String[] args) {
        
    }
    public static int[] reverse(int[] array){
        int[] result={};
        for (int i = array.length - 1; i >= 0; i--) {
            result= ArraysUtulitiy.addElement(result,array[i]);

            
        }return result;
    }
}
