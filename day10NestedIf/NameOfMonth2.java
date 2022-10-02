package day10NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {

    /*    int number=15;
        number=8;
        String result="";//when you give string like that result is gona be temporary
        if (number>=1&&number <=12){
            if (number==1){result="January";}
            else if (number==2) {result="February";}
            else if (number==3) {result="March";}
            else if (number==4) {result="April";}
            else if (number==5) {result="May";}
            else if (number==6) {result="June";}
            else if (number==7) {result="July";}
            else if (number==8) {result="August";}
            else if (number==9) {result="September";}
            else if (number==10) {result="October";}
            else if (number==11) {result="November";}
            else  {result="December";}


        }else{result="Invalid Number";}
        System.out.println(result);

     */

int n=1;
        String Month=(n==1)?"January":n==2?"Feb":(n==3)?"March":(n==4)?"April":(n==5)?"May":(n==6)?"june":
                (n==7)?"July":(n==8)?"Aug":(n==9)?"Sep":(n==10)?"Oct":(n==11)?"Nov":"Decm";
//in Ternaries is paranteses is not must in IF stattement is must
        System.out.println("Month is = " + Month);



    }
}
