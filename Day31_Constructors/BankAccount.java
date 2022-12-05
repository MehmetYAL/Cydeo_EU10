package Day31_Constructors;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=$ " + balance +
                '}';
    }
    public void checkBalance(){

        System.out.println("Your balance is:" + balance);
    }
    public void deposit(double amount){
        if (amount<=0){
            System.out.println("deposit amount can not be zero or negative");
            return;
        }
        balance+=amount;
    }
    public void withDraw(double amount){
        if (amount>balance){//if withdraing amoubnt is more than balance
            System.out.println("Insufficient balance");
        }
        if (amount<=0){//if amount is negative or zero
            System.out.println("withDrawing amount can not be zero or negative ");
            return;
        }
        balance-=amount;
    }
}
