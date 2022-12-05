package HomeWork;

public class Day10_task4 {
    public static void main(String[] args) {
        int age=99;
        String result="";
        if (age>=1&&age<=150){if (age<=21){result="Teanager";}
        else if (age<55) {result="Adult";}
            else {result="Senior";}



        }else {result="Invalid";}
        System.out.println(result);
    }
}
