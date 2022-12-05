package Day26_CustomMethodsPractice;

import java.util.Arrays;

public class removeElements1 {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};
        numbers=removeElement(numbers,2);
        System.out.println(Arrays.toString(numbers));

    }
                                   //   {1,2,3,4,3}     4
    public static int[] removeElement(int[]array, int index){
        if (index<0||index> array.length-1){
            System.out.println("invalod index");
            System.exit(0);
        }
        //REMOVES THE INDEX
int[] result=new int[array.length-1];
int j=0;
        for (int i=0 ;i< array.length;i++) {//if the index of array is matching with the given index
if (i==index)
{   continue;}//skipp the matching index
result[j++]=array[i];
        }return result;

    }
    public static double[] removeElement(double[]array, int index){
        if (index<0||index> array.length-1){
            System.out.println("invalod index");
            System.exit(0);
        }
        //REMOVES THE INDEX
        double[] result=new double[array.length-1];
        int j=0;
        for (int i=0 ;i< array.length;i++) {//if the index of array is matching with the given index
            if (i==index)
            {   continue;}//skipp the matching index
            result[j++]=array[i];
        }return result;

    }

    public static char[] removeElement(char[]array, int index){
        if (index<0||index> array.length-1){
            System.out.println("invalod index");
            System.exit(0);
        }
        //REMOVES THE INDEX
        char[] result=new char[array.length-1];
        int j=0;
        for (int i=0 ;i< array.length;i++) {//if the index of array is matching with the given index
            if (i==index)
            {   continue;}//skipp the matching index
            result[j++]=array[i];
        }return result;

    }

    public static String[] removeElement(String[]array, int index){
        if (index<0||index> array.length-1){
            System.out.println("invalod index");
            System.exit(0);
        }
        //REMOVES THE INDEX
        String[] result=new String[array.length-1];
        int j=0;
        for (int i=0 ;i< array.length;i++) {//if the index of array is matching with the given index
            if (i==index)
            {   continue;}//skipp the matching index
            result[j++]=array[i];
        }return result;

    }


}
/*
Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs:
			an integer array and an integer index. the method removes the element
			at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parametetrs:
			a double array and an integer index. the method removes the element
			 at the given index of the array and returns the new array


			2.3 Create a method that passes two parametetrs:
			a char array and an integer index. the method removes the element
			 at the given index of the array and returns the new array

			2.4 Create a method that passes two parametetrs:
			a String array and an integer index. the method removes the element
			 at the given index of the array and returns the new array

 */