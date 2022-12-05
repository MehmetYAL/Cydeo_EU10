package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};
        //should be {50,40,30,20,10}
        int[] reversed=new int[numbers.length];//make sure Array has enough capactity and same capacity of first element
    /*
              j                     i
     reversed[0]= numbers[numbers.length-1];
       reversed[1]= numbers[numbers.length-2];
       reversed[2]= numbers[numbers.length-3];
       reversed[3]= numbers[numbers.length-4];
       reversed[4]= numbers[numbers.length-5];
sayilari (tersten)reverse yapmak icin  onceyeni bir int ile tersten baslattiracak hale getiririz.
sonra ilk ters sayiyi sondan one getirecek sekilde kodlariz, ama cok sayi oldugunda cok fazla tek tekolacagindan
loop kullanacagiz..
*/



        //System.out.println(Arrays.toString(reversed));----buraya yazilmaz


            for (int i = numbers.length-1,j=0; i >= 0; i--,j++) {
                reversed[j]=numbers[i];
            }System.out.println(Arrays.toString(reversed));




    }
}
