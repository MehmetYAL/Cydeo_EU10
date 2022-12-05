package day20_Array;

import java.util.Arrays;

public class Alphabettt {
    public static void main(String[] args) {
        char[] alphabet=new char[26];//Z---to--A


        //alphabet[0] ='Z';
        char ch='Z';
        for (int i =0 ; i < alphabet.length ; i++) {
            alphabet[i]=ch;//alphabet[0] ='Z'; bunun herseferinde degisken verileri olmasi icin
            // alpahabet kismina index kismi 'Z' yerinede degisken char kismi yazilir, index artarken
            // char azalacagindan index++ olur veri -- olur

            ch--;

        }
        System.out.println(Arrays.toString(alphabet));

    }
}
