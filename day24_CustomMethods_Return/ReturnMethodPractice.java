package day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
int max =maxNumber(100,200);
        System.out.println(max);
        //find the max number between 100 & 200
        //multuiply the max number by two

    }

    public static int maxNumber(int a,int b) {
int result=0;
if (a>b){result=a;}else {result=b;}

return result;
   }


}


