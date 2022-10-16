package Day16_Loop_String;

public class frequencyOfWord2 {
    public static void main(String[] args) {
        String str="cat cat cat cat dog cat dog";
        int fre=0;
        for (int i = 0; i <=str.length()-3 ; i++) {
            String cat=str.substring(i,i+3);
            if (cat.equals("cat")){ fre++;}

        }
        System.out.println(fre);
    }
}
