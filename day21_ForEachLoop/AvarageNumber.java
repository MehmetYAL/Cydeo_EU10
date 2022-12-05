package day21_ForEachLoop;

public class AvarageNumber {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50,60};
        double sum=0;
        for (int num : numbers) {
            sum++;
            sum+=num;
        }double avarage=sum/ numbers.length;
        System.out.println("avarage = " + avarage);
    }
}
