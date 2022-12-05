package Day29_ArrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        /*

        Bulk Operations: argumnet MUST be a collection type

	addAll(CollectionType): adds collection of values to the arrayList
	removeAll(CollectionType): removes all the matching elements from the arraylist
	retainAll(CollectionType): removes all the non-matching elements from the arraylist
	containsAll(CollectionType): checks if all the elements are contained in the arraylist

         */
        //addAll Arrays tum e;ementleri tek seferde ekler
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,9,10,3,5,8,3));
         System.out.println(list);
        System.out.println("===============================");

        //removeAll() tek seferde birden fazla elementin "remove" olmasini saglar

        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);
        System.out.println("=============================================");

        //retainAll--- remove all the non-matching elements-- teksefer yazilanlari "remove" eder

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,100,200,300,800,900));
        numbers.retainAll(Arrays.asList(100,200,300));//kalmasini istedgin elementler parantez icine yazilir
        System.out.println(numbers);


        ArrayList<String> jobTitles=new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET","ScrumMAster","BA","BA","BA"));
        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles);

        System.out.println("=========================================================");

        //containsAll birden fazla elementin olup olmadigini tek seferde kontrol etmek icin kullanilir
        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean r1=nums.contains(10);
        boolean r2=nums.contains(2)&&nums.contains(5);
        boolean r3= nums.containsAll(Arrays.asList(2,5,10));
        System.out.println("=============================================");
        //asList Array i ArrayListe cevirebilir ve size boylece degisebilir hale gelir
        String[] names={"jish","Jack","Daniel","Shay","Breanna"};
        ArrayList<String> namelist=new ArrayList<>(Arrays.asList(names));//veya asagidaki sekilde olabilir
       // namelist.addAll(Arrays.asList(names));
        System.out.println(namelist);
        System.out.println("============================================");
        Integer[] arr={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);
        System.out.println("=========================================");
        int[] arr2={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list3=new ArrayList<>(convertArrayList(arr2));
        System.out.println("list3 = " + list3);



    }public static ArrayList<Integer> convertArrayList(int[] array){
        ArrayList<Integer> list=new ArrayList<>();
        for (int each : array) {
            list.add(each);

        }return list;
    }
}
/*
bulk operations: just for collection type
argument must be collection type
 */