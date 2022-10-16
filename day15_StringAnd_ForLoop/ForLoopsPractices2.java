package day15_StringAnd_ForLoop;

public class ForLoopsPractices2 {
    public static void main(String[] args) {


        for (int A_Z = 65; A_Z <= 90; A_Z++) {
            System.out.print((char)A_Z + " ");
        }

        for (char i='A';i<='Z';i++){
            System.out.print(i+" ");
        }

        System.out.println("------------------------------------");
        // A~Z----a~z---Z~A---z~a
     for (char i='a';i<='z';i++){
         System.out.print(i+" ");
     }
        System.out.println("\n ---------------------------------------");
     for (int i=122;i>=97;i--){
        System.out.print((char)i+" ");
     }
        System.out.println("\n_________________=====================");
     for (char i='Z';i>='A';i--){
         System.out.print(i+" ");
     }
        System.out.println("--------------");
     for (char i=97;i<=122;i++){
         System.out.print(i+" ");
     }





    }
}