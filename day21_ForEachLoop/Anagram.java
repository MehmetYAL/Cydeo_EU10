package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
         String str1="acdb";
         String str2="dbca";
         char[] sen=str1.toCharArray();
         char[] sen2=str2.toCharArray();
         Arrays.sort(sen);
         Arrays.sort(sen2);
        System.out.println(Arrays.toString(sen));
        System.out.println(Arrays.toString(sen2));
        boolean anagram=Arrays.equals(sen,sen2);
        System.out.println(anagram);
    }

}
