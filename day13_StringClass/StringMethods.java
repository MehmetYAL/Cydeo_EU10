package day13_StringClass;

public class StringMethods {
    public static void main(String[] args) {


        String word = "Cydeo";
        char thirdCharacter = word.charAt(2);//give the which number of chracter you want

        System.out.println("thirdCharacter = " + thirdCharacter);
        char tenthCharacter=word.charAt(2);//10 verilirse
        System.out.println("tenthCharacter = " + tenthCharacter);// eger karakter sayisi disinda sayi verilirse -out of range- der

        //lenght(); give total number of the character
        System.out.println("------------------------------------------- " );

        String s1="Batch EU-10 is best     ---batch, java programming";
        System.out.println("s1 = " + s1);
        int totalChars=s1.length();
        System.out.println("totalChars = " + totalChars);
        char lastCharacter=s1.charAt(s1.length()-1);// give the last index number

        System.out.println("lastCharacter = " + lastCharacter);
        System.out.println("--------------------------------------");

        String str="wooden spoon";
        str=str.toUpperCase();//"WOODEN SPOON"//
        //
        System.out.println(str);
        //if you want to all character to UpperCase
        //"Today is agreat day to learn"
        String sentence="Today is a great day to learn";
        sentence=sentence.toUpperCase();
        System.out.println("sentence = " + sentence);
    }
}
