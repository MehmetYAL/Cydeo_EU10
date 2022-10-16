package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        /*replace method-- oldvalue than replace it with new value;
                 */
        String str="Java is fun, I love learning Java";
       String str2=str.replace("Java","football");
        System.out.println("str = " + str);
        System.out.println("str = " + str);
String email="johnsmith@yahoo.com";
email=email.replace("yahoo","gmail");
        System.out.println("email = " + email);

        System.out.println(" ====================>>> ");
        String sentence="Java Java  Python Python C# C# C++ C++ Python Python Python Python ";
        String sentence2=sentence.replace("Python ","");
        sentence2=sentence2.replace("  "," ");
           System.out.println("sentence2 = " + sentence2);

        System.out.println("-----------------------------------------");

        String s1="Dog Dog Dog Dog Dog Dog Dog";
        s1=s1.replace("Dog","Cat");
        System.out.println("s1 = " + s1);

        String s2="C# is fun, C# is cool";
        s2=s2.replace(" C#","Java");
        System.out.println("s2 = " + s2);

        String s3="javaaaa java";
        s3=s3.replace("a","A");
        System.out.println("s3 = " + s3);
        System.out.println("=================================================");

        String result="Java Java Java";
        result=result.replaceFirst("Java","Python");
        System.out.println("result = " + result);

        String result2="C# is fun, C# is cool";
        result2.replaceFirst("C#","Java");
        System.out.println("result2 = " + result2);
//replace method replace all, replaceFirst changing first value
        String result3="Java";
        result3=result3.replaceFirst("a","A");
        System.out.println("result3 = " + result3);







    }
}
