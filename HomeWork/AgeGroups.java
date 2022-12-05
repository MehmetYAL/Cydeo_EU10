package HomeWork;

public class AgeGroups {
    public static void main(String[] args) {
        int age=101;
        boolean infant=age<=1&&age>=2;
        boolean Toddler=age<=3&&age>=5;
        boolean Kid=age<=6&&age>=9;
        boolean Pre_Teen=age<=10&age>=12;
        boolean teenAger=age<=13&&age>=17;
        boolean YoungAdult=age<=18&&age>=20;
        boolean Adult=age<=21&&age>=39;
        boolean YoungMiddleAgedAdult=age<=40&&age>=49;
        boolean MiddleAgedAdult=age<=50&&age>=54;
        boolean VeryYoungSeniorCitizen=age<=55&&age>=64;
        boolean YoungSeniorCitizen=age<=65&&age>=74;
        boolean SeniorCitizen=age<=75&&age>=84;
        boolean OldSeniorCitizen=age>84;
        if (infant){ System.out.println("infant");   }
        else if (Toddler) {System.out.println("Toddler");} else if (Kid) {
            System.out.println("Kid");} else if (Pre_Teen) {
            System.out.println("Pre-Teen");} else if (teenAger) {
            System.out.println("Teen Ager");} else if (YoungAdult) {
            System.out.println("Young Adult");} else if (Adult) {
            System.out.println("Adult");} else if (YoungMiddleAgedAdult) {
            System.out.println("Young Middle Aged Adult ");} else if (MiddleAgedAdult) {
            System.out.println(" Middle Aged Adult");} else if (VeryYoungSeniorCitizen) {
            System.out.println(" very Young Senior Citizen"); } else if (YoungSeniorCitizen) {
            System.out.println(" Young Senior Citizen");} else if (SeniorCitizen) {
            System.out.println("Senior Citizen");} else {
            System.out.println("Old Senior Citizen Almost Dead");

        }}

    }



















