package day07_Operators;

public class Castings {
    public static void main(String[] args) {
/*
        byte num;
        short num12;
        int num;
        long num4;
        float num5;
        double num6;

 */
        float averageScore=20.5f;
        byte num1=(byte)averageScore;//explict casting
        short num2= (short) averageScore; //explict casting
        int num3 = (int) averageScore; //explict casting
        float num4 = averageScore; //no casting
        double num5 = averageScore; //implict casting
        long num6= (long) averageScore;//explict casting

/*
-------
 */


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("==================================");


    }
}
