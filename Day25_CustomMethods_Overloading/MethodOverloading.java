package Day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        int[] intArray={5,6,0,-1,3,4};
        Arrays.sort(intArray);
        double[] doubleArray={5.5,6.6,11.2,21.5,4.3,5.4};
        Arrays.sort(doubleArray);
        char[] charArray={'a','b','d','t','h','k'};
        Arrays.sort(charArray);

        sumOfNumbers(10,20,30); //tum hersey ayni, parametreler farkli ise hepsine ayni
        //isim verilir ve void icinde cagrilinda ortak olan isim yazilir, sonra kactane parametre veya hangi
        //parametreyi verirsen ona gore compiler islem yapar..

    }

    public static int sumOfNumbers(int num1,int num2){
        return num1+num2;
    }

    public static int sumOfNumbers(int num1,int num2,int num3){
        return num1+num2+num3;}

    public static int sumOfNumbers(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }
    public static double sumOfNumbers(double num1,double num2){
        return num1+num2;
    }
    public static double sumOfNumbers(double num1,double num2,double num3){
        return sumOfNumbers(num1,num2)+num3;// bir onceki methoda yeni parametre eklenerekte
        //yeni method olusturulabilir..
    }

}
