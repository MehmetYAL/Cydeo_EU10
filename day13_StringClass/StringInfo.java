package day13_StringClass;

public class StringInfo {
    public static void main(String[] args) {
        String name="Wooden Spoon";
        String name2="Wooden Spoon";
        String name3="Wooden Spoon";
        String name4="Wooden Spoon";

        System.out.println(name==name2);//true
        System.out.println(name2==name3);//true
        System.out.println(name3==name4);//true

   //any class in"java.lang" is done bu compilerDD
        System.out.println("---------------------------------------");

        String str1=new String("Wooden Spoon");
        String str2=new String("Wooden Spoon");
        String str3=new String("Wooden Spoon");
        String str4=new String("Wooden Spoon");

        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str3==str4);
        System.out.println("-------------------------------------------------------");

        String s1="Java";
        String s2=new String("Java");// if it is lowerUppercase than give false

        System.out.println(s1.equals(s2));


    }
}
