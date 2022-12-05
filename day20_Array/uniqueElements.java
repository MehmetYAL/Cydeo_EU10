package day20_Array;

public class uniqueElements {
    public static void main(String[] args) {
        String[] words = {"Java", "Java", "C#", "Python", "Python"};

        for (int k = 0; k < words.length; k++) {
            String element = words[k];
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element))
                {count++;}  }
            if (count == 1) {
                System.out.println(element);

            }
        }


    }
}
