package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {

        int n1 = 100, n2 = 200;

        boolean n1isMin = n1 < n2;
        boolean n2isMin = n2 <n1;
        boolean equel = n1 == n2;
        // System.out.println( n1isMin + " is minimum number");

/*if(n1<n2){////doing the same as boolean even esier to use
    System.out.println(n1+" is the minimum number");
}
*/



        if (n1isMin) {
            System.out.println(n1 + " is the minimum number");

        }
        if (n2isMin) {
            System.out.println(n2 + " is the minimum number");
        }
        if (equel) {
            System.out.println(equel + "");


        }
    }}
