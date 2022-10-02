package day11_Switch_Scanner;

public class CrewAndPassangers {
    public static void main(String[] args) {

        int number = 75;
        String result = "";
        boolean validNumber = number == 50
                || number == 75 || number == 100;
        if (validNumber) {
            if (number == 50) {
                result = "20 Crew, 30 passangers";
            } else if (number == 75) {
                result = "25 Crew, 50 passangers";
            }
         else {
            result = "30 Crew; 70 passangers";
        }}else{
            result = "Invalid Number";
        }
        System.out.println(result);
    }
}