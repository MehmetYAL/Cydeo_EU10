package day15_StringAnd_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {
        //output 15 16 17 18...45

        for (int i=15;i<=45;i+=2){
            System.out.print(i+" BJK ");
            System.out.println("------------------------------------------------");}
            //100 99 98 97 ...50
            for ( int i=100;i>=50;i--){
                System.out.print(i+" ");
            }
        System.out.println("-------------------------------");
        //print all the even numbers1~55

        for (int i=1;i <=55;i++){if (i%2==0){
            System.out.print(i+" ");}
        }






    }
}
