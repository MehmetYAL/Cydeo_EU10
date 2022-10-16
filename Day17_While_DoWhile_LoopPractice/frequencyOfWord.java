package Day16_Loop_String;

public class frequencyOfWord {
    public static void main(String[] args) {
        String sen="javajavajavajavajava";
      int count=0;
        for (int i = 0; i <= sen.length()-4 ; i++) {//buradaki -4 kelimebin harf sayisi kadar oldugundan
            String eachSub=sen.substring(i,i+4);
            //System.out.println("eachSub = " + eachSub);
        if (eachSub.equals("java")){count++;}
        }
        System.out.println(count);

        }

        /*
        write a program that can return the frequency of the a word Java from
the sentence
Ex:
sentence = "Java Java";
output:
2
         */
    }

