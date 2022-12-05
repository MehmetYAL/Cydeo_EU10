package Day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sen="I Love Java";
        String[] word=sen.split(" ");
        String result="";
        for (int i =word[1].length()-1; i >= 0; i--) {
            result+=word[1].charAt(i);

        }
        System.out.println(result);
        //sen=sen.replaceFirst(word[1],result );
        word[1]=result;
        System.out.println(Arrays.toString(word));
        for (String s : word) {
            System.out.print(s+" ");

        }
    }
}
/*
	2. Write a program that can reverse the second word of the sentence
			Ex:				sentence = "I Love Java";
			output:				I evoL Java
 */
