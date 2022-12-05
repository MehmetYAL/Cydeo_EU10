package day24_CustomMethods_Return;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
        String str="cccccdddddaaaabbbb";
        str=removeDuplicates(str);
        System.out.println(str);

    }
        public static String removeDuplicates(String str){
        String result="";
            for (int i = 0; i <str.length() ; i++) {
                char each=str.charAt(i);
                if (!result.contains(""+each)){
                result+=each;}

            }
return result;
        }
   //1create a method that can remove duplicate character from astring and returns the new value

}
