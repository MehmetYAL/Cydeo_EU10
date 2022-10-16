package day16_ForLoopStringPractice;

public class UniqeCharacters {
    public static void main(String[] args) {
        String str="aaabccc";
        String result="";
        //if the first and last index of character are same.than the character is unique
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                result+=ch;
            }



        }System.out.println(result);
    }
}
