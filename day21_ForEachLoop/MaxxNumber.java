package day21_ForEachLoop;

public class MaxxNumber {
    public static void main(String[] args) {
        int[] numbers={10,5,4,22,55,1};
        int max=numbers[0];
        for (int num : numbers) {
            if (num>max){
                max=num;   }
        }
        System.out.println(max);
    }
}
