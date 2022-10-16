package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {
        //palandrome tersine yazildiginda bile kelime degismiyorsa"level-omo-mom-racecar gibi
        //tersine cevrilen kelime ile orjinal hali karsilastirilir, yazimi ayni ise o kelime
        //palandrome dir. equealiginore kuulanilir ki kucuk-buyuk harfi ayirtetmesin,
        // kelime palandrome ise boolen ile true veya false verir,Level=level palandromdir
        //mesela Mehmet--temheM palandrome degildir..
        String word="Level";
        String reversed="";
        for (int i =word.length()-1; i >=0 ; i--) {
            reversed+=word.charAt(i);

        }boolean isPalandrome=word.equalsIgnoreCase(reversed);
        System.out.println("isPalandrome = " + isPalandrome);
        System.out.println(reversed);
    }
}
