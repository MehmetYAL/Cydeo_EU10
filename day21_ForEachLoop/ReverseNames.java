package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {
        String[] classMates={"mehmet yal","ahmet ali","tamer can","ayse hale","alper melih","cydeo sco"};
        for (String each : classMates) {

            String result="";
            for (int i = each.length()-1; i >=0 ; i--) {
                result+=each.charAt(i);

            }
            System.out.println(result);

        }


    }
}
