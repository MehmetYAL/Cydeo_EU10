package day09_IfStatements;

public class Grade_Report {
    public static void main(String[] args) {
        int grade=45;
if (grade>=90){
    System.out.println("A");
} else if (grade>=80&&grade<=90) {
    System.out.println("B");
} else if (grade<=79&&grade>=70) {
    System.out.println("C");
} else if (grade<=69&&grade>=60) {
    System.out.println("D");
}
else {
    System.out.println("Failed");
}
    }
}
