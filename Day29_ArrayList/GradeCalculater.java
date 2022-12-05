package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculater {
    public static void main(String[] args) {
        ArrayList<Integer> scores= new ArrayList<>();

        scores.addAll(Arrays.asList(100,95,75,85,65,85,55,45,73,73,35,47));
        ArrayList<Integer> gradeOfA=new ArrayList<>(scores);//90-100
        gradeOfA.removeIf(p-> !(p>=90&&p<=100));
        System.out.println(gradeOfA);

        ArrayList<Integer> gradeOfB=new ArrayList<>(scores);//80-90
        gradeOfB.removeIf(p-> !(p>=80&&p<=89));
        System.out.println("gradeOfB = " + gradeOfB);

        ArrayList<Integer> gradeOfC=new ArrayList<>(scores);//70-79
        gradeOfC.removeIf(p-> !(p>=70&&p<=79));
        System.out.println("gradeOfC = " + gradeOfC);

        ArrayList<Integer> gradeOfD=new ArrayList<>(scores);//60-69
        gradeOfD.removeIf(p-> !(p>=60&&p<=69));
        System.out.println("gradeOfD = " + gradeOfD);

        ArrayList<Integer> gradeOfF=new ArrayList<>(scores);//0-59
        gradeOfF.removeIf(p-> p>59);
        System.out.println("gradeOfF = " + gradeOfF);
        System.out.println(" Total number of A: "+gradeOfA.size());
        System.out.println(" Total number of B: "+gradeOfB.size());
        System.out.println(" Total number of C: "+gradeOfC.size());
        System.out.println(" Total number of D: "+gradeOfD.size());
        System.out.println(" Total number of F: "+gradeOfF.size());

    }
}
