package HomeWork;

public class Day11_task4_CydeoBatches {
    public static void main(String[] args) {

        String batch="Us Morning";
        String result="";
        switch (batch){
            case "Us Morning":result="Class times are 10-5 EST. M, T, Th, F.";
            break;
            case "US Evening":result="Class times are 7-10 EST. M, T, Th, F.";
            break;
            case "EU":result="Class times are  10-5 EST. M, T, W, Th, F.";
            break;
            default:
                result=("Invalid Btach");

        }
        System.out.println(result);

        System.out.println("-------------------");

String batch2="EW";
String result2="";
boolean isBatch= batch2=="EU"||batch2=="US Morning"||batch2=="US evening";
if (batch2=="EU")result2="Class times are  10-5 EST. M, T, W, Th, F.";
else if (batch2=="US morning") result2="Class times are 10-5 EST. M, T, Th, F. ";
else if (batch2=="US evening")result2="Class times are 7-10 EST. M, T, W, Th, S, S.";
    
 else {result2="Invalid Class";}
        System.out.println(result2);



    }
}
