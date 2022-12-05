package day20_Array;

public class AppearedTwice {
    public static void main(String[] args) {
        char[] letters={'A','A','A','B','C','C','D','D','D'};
        for (int k = 0; k < letters.length; k++) {
            char ch=letters[k];
            int freq=0;

            for (int i = 0; i < letters.length; i++) {
                if (letters[i]==ch){freq++;}
            }if (freq==2) System.out.println(ch);
        }


    }
}
