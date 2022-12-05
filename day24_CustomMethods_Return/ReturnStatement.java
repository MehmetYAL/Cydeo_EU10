package day24_CustomMethods_Return;

public class ReturnStatement {
    public static void main(String[] args) {
nameOfTheDay(7);
    }
    
    public static void nameOfTheDay(int number){
        if (number<1||number>7){//if number is invalid
            System.out.println("invalid");
            return ;//exit if
        }
        if (number==1){
            System.out.println("monday");
        } else if (number==2) {
            System.out.println("tuesday");
            
        }else if (number==3) {
            System.out.println("wednesday");

        }else if (number==4) {
            System.out.println("thursday");

        }else if (number==5) {
            System.out.println("friday");

        }else if (number==6) {
            System.out.println("saturday");

        }else {
            System.out.println("sunday");
        }
    }
    
    
}
/*create a method that print the name of days*/