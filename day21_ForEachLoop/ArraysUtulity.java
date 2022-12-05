package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtulity {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        System.out.println(num);//give hashcode---hatali yazar
        System.out.println(Arrays.toString(num));// [1,2,2,4,5] olarak yazar
        System.out.println(num[0]);//1 i yazar
        System.out.println("=============================================");

        int[] scores={95,100,55,65,87,96};
        Arrays.sort(scores);//numaralari kucukten buyuge yerlestirir
        System.out.println(Arrays.toString(scores));// numaralari kucukten buyuge yazdirir
        System.out.println("min score="+scores[0]);//siraya sokulmus arrayin ilk indexindekini veiri
        System.out.println("max score="+scores[scores.length-1]);//siraya konul,is Array in son indexindekini verir

        String[] names={"hakan","james","kartal","ahmet","ahsen"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("=============================================================");


        int[] arr1={1,2,3};
        int[] arr2={1,3,2};
        boolean r1=Arrays.equals(arr1,arr2);// ayni indextekileri karsilastirir ve ayni iNdexte ayni karakter
        //varsa komple TRUE verir, tum indexler ayni kaRakter tamamen eslesmezse FALSE verir

        System.out.println(r1);

        Arrays.sort(arr1);//once iki arraydeki indexleri siraya koyar
        Arrays.sort(arr2);// """"""
        boolean r2=Arrays.equals(arr1,arr2);// sonra siraya konulmus hali ile karsilastirir
        System.out.println(r2);
        System.out.println("==================================================================");

        char[] ch={'a','c','b'};
        char[] ch2={'b','a','c'};
// soru check if they are anagram


    }
}
