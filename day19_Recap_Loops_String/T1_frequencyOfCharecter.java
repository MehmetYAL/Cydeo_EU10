package day19_Recap_Loops_String;

public class T1_frequencyOfCharecter {
    public static void main(String[] args) {
        String str="aabcccdccccc";
        char ch=str.charAt(3);
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            char each=str.charAt(i);
            if (ch==each){
                count++;
            }

        }System.out.println(count);

    }
}
