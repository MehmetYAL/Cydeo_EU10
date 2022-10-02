package Day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {

    int score =69;
     boolean excellent= score>89;
     boolean great = score>=80&&score<=89;
     boolean good= score>=70 &&score<=79;
     boolean passed = score>=60&& !good;//! =opposite of good
        boolean failed = score <60;
        if (excellent) {
            System.out.println(" excelent");

        }
        if(great) {
            System.out.println( "great");
        }
        if(good){
            System.out.println("good");
        }
        if(passed) {
            System.out.println("passed");
        }
        if(failed){
            System.out.println("failed");
        }

   //task write a program that can display the name of the month
//number =1~12
//task2 can display the name of the day
        //number=1~7



    }
}
/*
ssore
90~100== excellent
80~89 ==> great
70~79 ==> good
60~69==>passed
0~59 ==>failed

 */