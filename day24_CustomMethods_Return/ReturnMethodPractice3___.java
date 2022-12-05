package day24_CustomMethods_Return;

public class ReturnMethodPractice3___ {
    public static void main(String[] args) {
        String str="aabccdee";

      for (int i=0;i<str.length();i++) {
          int freq = frequency(str, str.charAt(i));
          if (freq==1){
             System.out.println(str.charAt(i));
          }//System.out.println(str.charAt(i));
          //unique character
      }


    }
    public static int frequency(String str,char ch){
        int count=0;
        for (char each : str.toCharArray()) {
            if (each==ch);
            { count++;
            }

        }
        return count;
    }


}
