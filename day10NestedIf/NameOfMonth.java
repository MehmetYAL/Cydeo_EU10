package day10NestedIf;

public class NameOfMonth {
    public static void main(String[] args) {

        int num=15;
        num=8;
        String result="";//when you give string like that result is gona be temporary
        if (num>=1&&num <=12){
            if (num==1){result="January";}
            else if (num==2) {result="February";}
            else if (num==3) {result="March";}
            else if (num==4) {result="April";}
            else if (num==5) {result="May";}
            else if (num==6) {result="June";}
            else if (num==7) {result="July";}
            else if (num==8) {result="August";}
            else if (num==9) {result="September";}
            else if (num==10) {result="October";}
            else if (num==11) {result="November";}
            else  {result="December";}


        }else{result="Invalid Number";}
        System.out.println(result);

    }
}
