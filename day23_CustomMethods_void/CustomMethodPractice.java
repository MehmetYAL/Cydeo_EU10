package day23_CustomMethods_void;

public class CustomMethodPractice {
    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("-----------------------------------------------------");
        helloCyde5Times();
        System.out.println("-----------------");
        evenNumbers();

    }
    //create a function that hello world 5 times==>helloWorld5Times()
    public static void helloWorld5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("hello worlds");
        }
    }
    //create a function print helleo cyde 5 times==>helloCyde5Times()
    public static void helloCyde5Times(){
        for (int i = 0; i <5 ; i++) {

            System.out.println("hello cydeo");

        }
    }

    //creat a function can print all the even number from 1~10==>evenNumbers
    public static void evenNumbers(){
        for (int i = 2; i <=10 ; i++) {
            if (i%2==0) System.out.println(i);

        }
    }

}
