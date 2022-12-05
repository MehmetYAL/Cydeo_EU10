package Day31_Constructors;

import java.util.Arrays;

public class BankAccountObject {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount();
        account1.setInfo("Mehme Yalcin",23344556);
        System.out.println(account1);
        account1.deposit(1000);
        account1.checkBalance();
        account1.withDraw(1200);
        account1.checkBalance();
        System.out.println("==============================");

        BankAccount account2=new BankAccount();
        account2.setInfo("Alper YAlcin",99887799);
account2.deposit(12000);
account2.checkBalance();


    }
}
