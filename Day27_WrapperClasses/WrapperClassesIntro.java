package Day27_WrapperClasses;

import Utulities.ArraysUtulitiy;

public class WrapperClassesIntro {
    public static void main(String[] args) {
int num1=200;
//long n1=num1;
        Integer n1=num1;//autoboxing
        int num2=num1;//unboxing

        System.out.println("=============================================");

        Integer integerValue=100;
        long longValue=integerValue;
        Byte b1=25;
        byte a1=b1;
        short a2=b1;
        int a3=b1;
        long a4=b1;
        System.out.println("---------------------------------------");
        int num3=200;
       // long l2=num3;
        Integer num4=num3;//autobaxing
        System.out.println("----------------------------------------");
        Integer z=900;
        Integer y=z;
        System.out.println("--------------------------------");

        int[] numbers1={1,2,3,4};
        Integer[] numbers2={1,2,3,4};



    }
}
