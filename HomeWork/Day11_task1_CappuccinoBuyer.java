package HomeWork;

import java.lang.invoke.SwitchPoint;

public class Day11_task1_CappuccinoBuyer {
    public static void main(String[] args) {

        String size="tall";
        double price=0.0;
        int cal=0;

        switch (size){
            case "tall":
                price=3.69;
                cal=90;

                break;
            case "grande":
                price=3.99;
                cal=120;
                break;
            case "venti":
                price=4.29;
                cal=150;
                break;
            default:
                System.err.println("invalid Size");



        }
        System.out.println("size = " + size);
        System.out.println("price = " + price);
        System.out.println("cal = " + cal);



    }

}
