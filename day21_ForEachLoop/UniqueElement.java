package day21_ForEachLoop;

public class UniqueElement {
    public static void main(String[] args) {
        String[] words = {"Java", "Java", "C#", "Python", "Python","mehmet"};
        for (String each:  words    ) {//"Java", "Java", "C#", "Python", "Python","mehmet"  hepsini Array disina cikarir
            int count=0;
            for ( String element:words ) {if (element.equals(each)){
                count++;
            }

            }if (count==1){System.out.println(each);}

        }





    }
}
