package Day18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {
        /*for (int i = 0; i <5 ; i++) { //repeat 5 times
            System.out.println("wooden spoon");

        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("wooden spoon");//repeat another 5 times

        }*/
        System.out.println("-------------------------------------------------");
        for (int j = 0; j <4 ; j++) {//icice olan forlooplari tekrar yazdirir,urada bir
            //loop 4 kez d;geride 4 5 kez yani 20 kez yazdiriyor
            for (int i = 0; i <5 ; i++) {
                System.out.println("wooden spoon");
            }

        }
    }
}
