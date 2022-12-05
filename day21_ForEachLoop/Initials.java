package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String[] classMates={"mehmet yal","ahmet ali","tamer can","ayse hale","alper melih","cydeo sco"};
       // for (int i = 0; i < classMates.length; i++) {

      //  }
        for (String eachName:classMates){
            String initial=eachName.charAt(0)+"."+eachName.charAt(eachName.indexOf(" ")+1);
            System.out.println(initial);
        }


    }
}
