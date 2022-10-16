package Day18_NestedLoop;

import java.util.Scanner;

public class logInFunction {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter you user name");
        System.out.println("enter your pasword");
        String uName= input.next();
        String pass= input.next();

        if (uName.equals("Cydeo")&&pass.equals("WoodenSpoon")){
            System.out.println("logged in");
        }else {
            for (int i = 0; i <3; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("please re-enter your username");
                uName= input.next();
                System.out.println("enter your password");
                pass= input.next();
                if (uName.equals("Cydeo")&&pass.equals("WoodenSpoon")) {
                    System.out.println("logged in");
                    break;
                }

            }if (!(uName.equals("Cydeo")&&pass.equals("WoodenSpoon"))){
                System.err.println("Your account is locked,contact the supoort team");
            }
        }
        /*
        You are writing a code for the log-in function of the Cydeo Application,
        assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the
                        user to have three attempts to enter correct credentials and
                        if all three attempts are failed, then print "Your account is locked."
         */
    }
}
