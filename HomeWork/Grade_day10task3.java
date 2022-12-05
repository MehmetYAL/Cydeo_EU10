package HomeWork;

public class Grade_day10task3 {
    public static void main(String[] args) {
        char grade='B';
        String result="";



        if (grade>='A'&&grade<='F'){if (grade=='A'){result="excellent";}
        else if (grade=='B') {result="great job";     }
        else if (grade=='C') {result="good";  }
        else if (grade=='D') {result="passed";}
        else{result="failed";}


        }else {result="Invalid";}

        System.out.println(result);
    }
}
