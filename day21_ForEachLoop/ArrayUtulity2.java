package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtulity2 {
    public static void main(String[] args) {
        //COPY ARRAY herzaman ilk endex ten baslar ve belirtilene kadar gider
        //bir array deki belirtilen indexi baska bir Array in icine copy eder

        String[] students={"elif","sinem","mehmet","cihat","james",};//ilk 3 ismi diger Array e copy edilecek
        String[] earlyBird= Arrays.copyOf(students,3);

        System.out.println(Arrays.toString(earlyBird));
        System.out.println(Arrays.toString(students));
        System.out.println("--------------------------------------------------------------");

        char[] ch1={'A','B','C','D','E','F','G','H','I'};
        char[] ch2=Arrays.copyOfRange(ch1,2,6+1);
        System.out.println(Arrays.toString(ch2));

        System.out.println("===============================================================");

        int[] scores={10,20,30,40,50,60,70,80,90,100};
        int[] scores2=Arrays.copyOfRange(scores,4,9);
        System.out.println(Arrays.toString(scores2));





    }
}
