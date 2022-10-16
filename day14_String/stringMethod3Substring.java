package day14_String;

public class stringMethod3Substring
{
    public static void main(String[] args) {
        //subString()-- begining index ,ending index,
        String word="Cydeo School";
        String brand=word.substring(0, 4+1);
        System.out.println("brand = " + brand);

        String brand2=word.substring(6);//if untill end index dont have to write and number
        System.out.println("brand2 = " + brand2);
        System.out.println("-----------------------------------");

        String word2="Java Programming language";
        String s1=word2.substring(0, word2.indexOf(" "));
        System.out.println("s1 = " + s1);

        String s2=word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));
        System.out.println("s2 = " + s2);

        String s3=word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println("s3 = " + s3);


        //String s3=


    }
}
