package Day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name= "Josh";
        int age= 19;
        String citizen="usa";
        //Eligible
        //not elligible

        boolean isElligible= age>21 && citizen=="usa";
        boolean isNotElligible=!isElligible;
        if(isElligible){
            System.out.println( name+ " is eligible to vote");

        }
        if (isNotElligible){
            System.out.println(name+ " is not Eligible");
        }


    }
}
