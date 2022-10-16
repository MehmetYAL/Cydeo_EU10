package day14_String;

public class StringMethod1 {
    public static void main(String[] args) {

        String str1="    batch Eu10  ";
        str1.trim();// take the space out give "batch Eu10";
        System.out.println("str1 = " + str1);
        String str2="Cydeo School";
        int n1=str2.indexOf("h");
        System.out.println("n1 = " + n1);
        int n2=str2.indexOf("o");
        System.out.println("n2 = " + n2);
         int n3=str2.indexOf("ool");
        System.out.println("n3 = " + n3);
        System.out.println("--------------------");

        String str3="Java Programming Language";
        int n4=str3.indexOf("P");
        System.out.println("n4 = " + n4);

        int n5=str3.indexOf("g");
        System.out.println("n5 = " + n5);
        int lastCh=str3.lastIndexOf("e");
        System.out.println("lastCh = " + lastCh);
        System.out.println("------------------------------------------");

        String s="Java Nova Cava Wawa orange";
        int firstA=s.indexOf("a");
        int lastA=s.lastIndexOf("a");
        int secondA=s.indexOf("a ");
        int fifthA=s.lastIndexOf("va");
        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("fifthA = " + fifthA);
        int sixthA=s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);









    }
}
