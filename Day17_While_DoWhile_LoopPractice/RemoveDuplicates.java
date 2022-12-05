package Day17_While_DoWhile_LoopPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="AABBCC";
        String result="";// output:ABC
        for (int i = 0; i <str.length() ; i++) {
            String ch=""+str.charAt(i);//A,A,B,B,C,C,
            if (result.contains(ch)){//if result allready contains the character-
                continue;
            }
            result+=ch;

        }
        System.out.println(result);
    }
}
