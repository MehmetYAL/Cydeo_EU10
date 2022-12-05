package day19_Recap_Loops_String;

public class HighestFrequency {
    public static void main(String[] args) {
        String str="java is cool and java is fun to coding";
        String result="";
        int max=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                char xy=str.charAt(j);
                if (ch==xy){count++;
                }
            }if (count>max){
                result=""+str.charAt(i);
                max=count;
            }
        }
        System.out.println(result);

    }
}
