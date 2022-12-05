package Utulities;

import java.util.Arrays;

public class StringUtulity {
    public static void main(String[] args) {
printEachChar("mehmet");
    }
    public static void printEachChar(String str){
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i)+"-");

        }
    }
    //reverses the given String and returns the reversed string
    public static String reverse(String str1){
        String result="";
        for (int i=str1.length()-1;i>=0;i--){
            result+=str1.charAt(i);
        }return result;
    }

public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    //if the given strin is palindrome, returns boolean

}
public static boolean anagram(String str1,String str2){
  //"acb","bca"

    char[] ch1=str1.toCharArray();
    char[] ch2=str2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);

    return Arrays.equals(ch1,ch2);

}

//remove the duplicates from given string returns String


    public static String removeDuplicates(String str){
        //aaabbbbccc====>abc
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char each=str.charAt(i);
            if (!result.contains(""+each)){
                result+=each;
            }

        }return result;


    }
}
