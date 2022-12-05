package Day27_WrapperClasses;

import Utulities.ArraysUtulitiy;

public class WrapperClassMethod {
    public static void main(String[] args) {
        String str="123";
        int num=Integer.parseInt(str);//int
        System.out.println(num+1);
        System.out.println(str+1);

        String str2="10.5";
        double num2=Double.parseDouble(str2);

        System.out.println(num2+1);
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        long max2=Long.MAX_VALUE;
        long min2=Long.MIN_VALUE;
        System.out.println("min2 = " + min2);
        System.out.println("max" +max2);

        String s1="true";
        boolean r1=Boolean.parseBoolean(s1);
        System.out.println(r1);

        System.out.println("=============================================");

        String s2="123";

        Integer x=Integer.valueOf(s2);
        int y=Integer.valueOf(s2);
        System.out.println(x);
        System.out.println("=====================================================================");

        char ch1='0';
boolean r3=Character.isDigit(ch1);
        System.out.println(r3);

        boolean r4=Character.isLetter(ch1);
        System.out.println(r4);
        boolean r5=Character.isLetterOrDigit(ch1);
        System.out.println(r5);
        boolean r6=Character.isLowerCase(ch1);
        System.out.println(r6);
        boolean r7=Character.isUpperCase(ch1);
        System.out.println(r7);

        System.out.println("-------------------------------------------");

        String s3="ab1cd3eh3jh4ki6";
        int sum=0;


    }
}
