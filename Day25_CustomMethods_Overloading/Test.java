package Day25_CustomMethods_Overloading;
import Utulities.StringUtulity;

public class Test {
    public static void main(String[] args) {
        String str="Java programming Language";
        StringUtulity.printEachChar(str);
        System.out.println();
        System.out.println("=============================");
String s1="wooden spoon";
        String reverse= StringUtulity.reverse(s1);
        System.out.println(reverse);

        System.out.println("================");
        String word="civic";
        boolean palindrome= StringUtulity.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);
        System.out.println("============================================");
        String[] names={"Anna","Java","Python","recacer","mom","Cydeo"};
        int count=0;
        for (String each : names) {
            if (StringUtulity.isPalindrome(each)){
                count++;
            }
                    }System.out.println("palindrome word count is: "+count);
        System.out.println("=====================");
        String chars="aaabbbccddd";
        String removeDup= StringUtulity.removeDuplicates(chars);
        System.out.println(removeDup);
        System.out.println(StringUtulity.removeDuplicates(chars));
    }
}
