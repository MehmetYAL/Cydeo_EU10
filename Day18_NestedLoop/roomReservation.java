package Day18_NestedLoop;

import java.util.Scanner;

public class roomReservation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("which beds so you want to reseve");
            String bedType = input.nextLine().toLowerCase();

            int king=120;
            int Queen=100;
            int single=100;
            if (bedType.equals("King bed")||bedType.equals("Queen bed")||bedType.equals("single bed")){
                System.out.println("how many nights you want to stay");
                int night = input.nextInt();
                System.out.println("price is: $");
            }
        }
        /*
        Create a class called RoomReservation, write a program for the room
reservation:
King Bed ==> 120$
Queen Bed ==> 100$
single Bed ==> 80$
the program asks the user which bedroom does he/she wants to
reserve, and how many nights he/she is staying.
Then Ask the user "would you like to reserve another room?""
if yes ==> repeat the entire steps
if no ==> return the  total price
If user enters any invalid entry,  ask the user to re-
enter until user provides a valid entry
         */
    }
}
