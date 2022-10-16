package Day17_While_DoWhile_LoopPractice;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Benimle evlenirmisin");
        String marry= input.nextLine().toLowerCase();
        while( !(marry.contains("yes")||marry.contains("no"))){
            System.out.println("yanlis cevap evet yada hayir de, yes or no simple");
            marry= input.next().toLowerCase();
        }


            if (marry.equals("yes")){
                System.out.println("Congralations, you are very lucky");
            } else if (marry.equals("no")) {
                System.out.println("so stupid , how come you miss this chance");

            }
        }

    }

