package day13_StringClass;

public class StringMethods1 {
    public static void main(String[] args) {

        String str="Wooden Spoon";
        char str1=str.charAt(0);
        System.out.println("str1 = " + str1);
        System.out.println("-------------------------------");

        int str2=str.length();
        System.out.println("str2 = " + str2);
        System.out.println("--------------------------------");
        int indexLast=str.length() -1;
        System.out.println("indexLast = " + indexLast);
        System.out.println("------------------------");
        String lowerCase=str.toLowerCase();
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("--------------------------");
        String language="    java programing language     ";
        language=language.trim();
        System.out.println("language = " + language);// take begining and the end of sentences space
        // not space beetween words

        System.out.println("------------------------------------------------------");

        String strS="Wooden Spoon";
        int indexNumFirst=strS.indexOf("o");
        System.out.println("indexNumFirst = " + indexNumFirst);
        int indexNumOfSecond=strS.indexOf("od");
        System.out.println("indexNumOfSecond = " + indexNumOfSecond);



    }
}
