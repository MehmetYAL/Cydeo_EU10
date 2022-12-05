package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        int[] num={10,20,30,40,50,60,70};
        for (int i = 0; i <num.length ; i++) {
            int eachElement=num[i];
            System.out.println(eachElement);
        }
        System.out.println("--------------------------------------------------");
        for (int each:num){
            System.out.println(each);
        }
    }
}
