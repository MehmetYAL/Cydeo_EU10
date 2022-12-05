package day24_CustomMethods_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        String str = "Java";
        //reverse(str);
        String result = reverse(str);
        System.out.println(result);
        if (str.equalsIgnoreCase(result)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not a plindrome");
        }
    }
    /* public static void reverse(String str){//"java"
         String reverse="";
         for (int i=str.length()-1;i>=0;i--){
             reverse+=str.charAt(i);
         }
         System.out.println(reverse);*/
    public static String reverse(String str) {//"java"
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }return reverse;
    }

}
