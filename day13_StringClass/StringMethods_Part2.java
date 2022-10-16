package day13_StringClass;

public class StringMethods_Part2 {
    public static void main(String[] args) {

        String str="Wooden Spoon";
       str= str.replace("o","e");// replace the target character to new 
        //character. you dont write target, you  put"" and than old and new target comes by it self
                System.out.println("str = " + str);

        System.out.println("----------------------------");
        
        String sentence="I love java; java is the best programming language";
        sentence=sentence.replace("java","mehmet");
        System.out.println("sentence = " + sentence);
        sentence=sentence.replace("mehmet","Java");
        System.out.println("sentence = " + sentence);
        System.out.println("--------------------------------");

        String str2="Wooden Spoon";
        str2=str2.replaceFirst("Spoon","SSSpoon");
        System.out.println("str2 = " + str2);
        System.out.println("---------------------------");
        String str3="i love Java, Java is the best";
        str3=str3.replaceFirst("Java","MehMeT");
        System.out.println("str3 = " + str3);
        str3=str3.replace("Java","mehmet");
        System.out.println("str3 = " + str3);
        System.out.println("---------------------------------");
        String str4="Java programing language";
        String result=str4.substring(str4.indexOf("p"));
        System.out.println("result = " + result);
        System.out.println("-------------------------");

        String result2=str4.substring(5,16);//ending index is excluded...
        System.out.println("result2 = " + result2);
        System.out.println("-----------------------");


    }

}
