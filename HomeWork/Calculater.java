package HomeWork;

public class Calculater {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        char mathOperator = '*';


        if (mathOperator == '+') {
            System.out.println(num1 + num2);
        } else if (mathOperator == '-') {
            System.out.println(num2 - num1);
        } else if (mathOperator == '*') {
            System.out.println(num1 * num2);
        } else if (mathOperator == '/') {
            System.out.println(num2 / num1);
        } else {
            System.out.println("Invalid");
        }
    }
}
