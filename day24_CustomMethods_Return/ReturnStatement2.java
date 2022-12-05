package day24_CustomMethods_Return;

public class ReturnStatement2 {


    public static void months(int monthNum) {

        if (monthNum<1||monthNum>12) {
            System.out.println("invalid");
            return;// when you use void if you use condition and condition is not valid
            //return printing it exit the method//void methodunda if eger saglanmiyorsa
            // RETURN ILE METHOD SONLANIR VE ASAGI KONTROL ETMEZ
        }
        String name = "";
        if (monthNum > 0 && monthNum <= 12) {
            name = (monthNum == 1) ? "jan" : (monthNum == 2) ? "feb" : (monthNum == 3) ? "march" : (monthNum == 4) ? "april" : (monthNum == 5) ? "may" :
                    (monthNum == 6) ? "june" : (monthNum == 7) ? "july" : (monthNum == 8) ? "august" : (monthNum == 9) ? "sept" : (monthNum == 10) ? "oct" : (monthNum == 11) ? "nov" : "dec";

        } else {
            name = ("invalid number");
        }
        System.out.println("name of the month is " + name);
    }

}