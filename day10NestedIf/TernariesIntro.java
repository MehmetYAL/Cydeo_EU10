package day10NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n=100;
        if (n%2==0){
            System.out.println("Even");//string
        }else {
            System.out.println("Odd");//string
                    }
        System.out.println("--------------------");
        String result1=(n%2==00)?"Even":"odd";
        System.out.println(result1);
        System.out.println("---------------------------------------");

        int age=22;
        if (age>=21){
            System.out.println("is Eligible");
        }else {
            System.out.println("is not eligible");
        }
        System.out.println("--------------------");
int age2=17;
/* string result2= or===>  */   System.out.println((age2>=21)?"Eligible":"is not eligible");

        System.out.println("----------------");
        int number = 100;
        number=0;
        String result3=(number>0)?"Positive":(number<0)?"Negative":"zero";
        System.out.println(result3);


    }
}
