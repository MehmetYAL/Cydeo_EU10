package Utulities;

public class MathUtulity {
    public static void main(String[] args) {
int num=1250;
        System.out.println(evenNumber(num));
    }
public static int sumOf2Numbers(int num1,int num2){
        int sum=num1+num2;
    return sum;
}
    public static double sumOf2Numbers(double num1,double num2){
        double sum=num1+num2;
        return sum;
    }

    public static int SubOf2Numbers(int num1,int num2){
        int sum=num1-num2;
        return sum;
    }
    public static double SubOf2Numbers(double num1,double num2){
        double sum=num1-num2;
        return sum;
    }

    public static int multiP2Numbers(int num1,int num2){
        int sum=num1*num2;
        return sum;
    }

    public static boolean evenNumber(int num1){
             return (num1%2==0)? true: false;    }
    public static boolean isEven(int num){
        return (num%2==0)? true: false;
    }
    public static int max(int num1, int num2){
        return (num1>num2) ? num1 : num2;
    }


    public static double max(double num1, double num2){
        return (num1>num2) ? num1 : num2;
    }


    public static int min(int num1, int num2){
        return (num1<num2) ? num1 : num2;
    }


    public static double min(double num1, double num2){
        return (num1<num2) ? num1 : num2;
    }


    public static int square(int num){
        return num * num;
    }


    public static double square(double num){
        return num * num;
    }


    public static int cube(int num){
        return num * num * num;
    }


    public static double cube(double num){
        return num * num * num;
    }





}
