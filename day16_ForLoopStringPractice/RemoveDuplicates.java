package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        //birden fazla yazilanin sadece birtane yazdirma
        String str="aabbacc";
        String result="";

        for (int i = 0; i <=str.length()-1 ; i++) {//i=represent index number of str-start from zero
            String ch=""+str.charAt(i);
            if (!result.contains(ch)){//if the character is not contained in the result
            result +=ch;}//the chracter will be added to the result
        }
        System.out.println(result);



    }
}
