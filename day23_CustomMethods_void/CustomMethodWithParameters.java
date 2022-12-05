package day23_CustomMethods_void;

public class CustomMethodWithParameters {
    public static void main(String[] args) {
       // oddEven();//the method demands additional info to complete its task
        //parantezli data verildiginde parantez icine argumani verilmeli data bilgisi verilmeli yoksa hata verir
        oddEven(9);
        System.out.println("--------------------------------");
        ageOfPerson(1976);


    }


    //create a function that can check if a number odd or even number
    public static void oddEven(int number){
        if (number%2==0){
            System.out.println(number+" is even number");
        }else {
            System.out.println(number+" is odd number");
        }
    }

    //create a function that can display age of the person
    public static void ageOfPerson(int birthYear){
        int age= 2022-birthYear;
        System.out.println("your age is "+ age);
    }
//create a fuction that can print all the numbers between x and y
    public static void printNumbers(int x, int y){

    }

}
