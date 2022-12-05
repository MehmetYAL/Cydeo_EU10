package HomeWork;

public class GradeLevel_day10Task {
    public static void main(String[] args) {

        byte num=88;
        String result="";
        if (num>=1&&num<=18){
if (num>=1&&num<=5){result="elemantary school";}
else if (num>=6&&num<=8)
{result="Middle School";}
else if (num>=9&&num<=12) { result="High School";}
else if (num>=13&&num<=16) {result="College";}
else {result="Grade";}

}else {result="Invalid";   }
        System.out.println(result);

        }


        }


