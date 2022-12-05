package Day17_While_DoWhile_LoopPractice;

public class cat_cat_dog_dog {
    public static void main(String[] args) {
        String sen="cat cat cat dog dog dog cat cat";
        sen= sen.toLowerCase();
        int count=0;

        while(sen.contains("cat")){
         sen=   sen.replaceFirst("cat","");
            count++;
        }
        System.out.println(count);
        System.out.println("-----------------------------------");

       String s1="java java java python python python";
       int countJava=0;
        int countPython=0;
        while (s1.contains("java")||s1.contains("python")){
            if (s1.contains("java")){
                s1=s1.replaceFirst("java","");
                countJava++;
            }
            if (s1.contains("python")){
                s1=s1.replaceFirst("python","");
                countPython++;

            }
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);
    }
}
