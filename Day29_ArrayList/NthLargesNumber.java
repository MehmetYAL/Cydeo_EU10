package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargesNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

      /*  list.removeIf(p-> Collections.max(list)==p);
        list.removeIf(p-> Collections.max(list)==p);*/ // mesela 5. max number bulmak icin max number remove of ile alinir
        //ama cok fazla sayi varsa for kullanilir

        int n=4;
        for (int i = 1; i <n ; i++) {
            list.removeIf(p-> Collections.max(list)==p);
        }

        int max=Collections.max(list);
        int min=Collections.min(list);
        System.out.println("max = " + max);

    }
}
/*
write a program that can return the nth largest number from an arraylist
			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5
			output:4
 */