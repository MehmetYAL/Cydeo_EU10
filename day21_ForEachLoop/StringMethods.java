package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str="Java";
        char[] chars=str.toCharArray();// stringi Array icine tek tek karakter olarak alir
        System.out.println(Arrays.toString(chars));// atr i bir yukarida Array icime aldiktan sonra harfa harf 4 indexli hale getirdi
        for (char each:str.toCharArray()){
            System.out.println(each);
                    }

        System.out.println("--------------------------------------------");
        System.out.println("===================================================================");

        String sen="Wooden Spoon";//stringi array icine alip ayri ayri index haline getirir string icin
        String[] words=sen.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("-----------------------------------------------");

        String email="woodenspoon@cyde.com";
        String[] arr=email.split("@");
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------------------------------------------");

        String s="today is nice day.today is monday.today we learn java";
        String[] strr2=s.split("\\.");
        System.out.println(Arrays.toString(strr2));



    }
}
