package HomeWork;

public class Day11_task2_Elevator {
    public static void main(String[] args) {
        int floorNum=2;
        if (floorNum>=1&&floorNum<=3){if (floorNum==1){
            System.out.println("Floor1 selected.Companies:lobby,verizon,Sturbucks");}
        else if (floorNum==2) {System.out.println(" Floor 2 selected. Companies:Cybertek, NASA, Intelsat");
                    } else if (floorNum==3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake House");   }

        }else {
            System.out.println("Invalid floor");}

        System.out.println("-----------------------------------------------" );
int floor=4;
switch (floor) {
    case 1 :
        System.out.println("Floor1 selected.Companies:lobby,verizon,Sturbucks");
        break;
    case 2:
        System.out.println("Floor 2 selected. Companies:Cybertek, NASA, Intelsat");
        break;
    case 3:
        System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake House");
    default:
        System.out.println("Invalid floor");

}
    }
}
