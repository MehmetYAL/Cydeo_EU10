package Day17_While_DoWhile_LoopPractice;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str ="Java " +
                "Java Python Python";
        int frequency=0;
        while (str.contains("Java")){
            str = str.replaceFirst("Java","");
            frequency++;
            }
        System.out.println("frequency = " + frequency);
        System.out.println("-------------------------------------");

String sent="cat cat dog dog";

sent=sent.toLowerCase();
int countCat=0;
while (sent.contains("cat")){
    sent=sent.replaceFirst("cat","");
    countCat++;
}
        System.out.println(countCat);
    }
}
