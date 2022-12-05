package HomeWork;

public class Day10_task5_biggerNumber {
    public static void main(String[] args) {
        int num1= 5, num2=50, num3=30;
        String biggerNum=(num1>num2&&num1>num3)?"num1 is bigger":(num2>num1&&num2>num3)?"number2 is bigger":
                "number3 is bigger";
        System.out.println(biggerNum);


    }
}
