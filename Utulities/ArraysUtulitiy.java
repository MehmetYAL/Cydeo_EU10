package Utulities;

import java.util.Arrays;

public class ArraysUtulitiy {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
//printEach(arr);
       Arrays.toString(printEachElements(arr));

    }
    //prints each integer of an integer array in seperate lines
    public static int[] printEachElements(int[] array){
        for (int each:array) {
            System.out.println(each);

        }
        return array;
    }
    //prints each double of double array in seperate lines
    public static double[] printEachElements(double[] array){
        for (double each:array) {
            System.out.println(each);

        }
        return array;
    }
    //prints each char of char array in seperate lines
    public static char[] printEachElements(char[] array){
        for (char each:array) {
            System.out.println(each);

        }
        return array;
    }
    //prints each String of String array in seperate lines
    public static String[] printEachElements(String[] array){
        for (String each:array) {
            System.out.println(each);

        }
        return array;
    }

///////////////////////////////////
    //returns the max number for integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);//LAST ELEMENT WILL BE MAX NUM
        return numbers[numbers.length-1];
    }

    //returns the max number for double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);//LAST ELEMENT WILL BE MAX NUM
        return numbers[numbers.length-1];
    }

    //return theminimum number from integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);//index zero ELEMENT WILL BE MAX NUM
        return numbers[0];}

    public static double min(double[] numbers){
            Arrays.sort(numbers);//index zero ELEMENT WILL BE MAX NUM
            return numbers[0];
    }

//////////////////////////////////////////////////

    //chekc if the given integer is contained in the given array. returns boolean contains(int[],int)
    public static boolean contain(int[] array,int element){//{1,2,3,4}  6===false 3====true
        boolean result=false;
        for (int each : array) {
            if (each==element) {result=true;}
            
        }return result;
    }
    
    //chekc if the given double is contained in the given array. returns boolean contains(oduble[],double)
    public static boolean contain(double[] array,double element){//{1,2,3,4}  6===false 3====true
        boolean result=false;
        for (double each : array) {
            if (each==element) {result=true;}

        }return result;
    }

    //chekc if the given char is contained in the given array. returns boolean contains(char[],char)
    public static boolean contain(char[] array,char element){//{1,2,3,4}  6===false 3====true
        boolean result=false;
        for (char each : array) {
            if (each==element) {result=true;}

        }return result;
    }

    //chekc if the given String is contained in the given array. returns boolean contains(String[],String)
    public static boolean contain(String[] array,String element){//{1,2,3,4}  6===false 3====true
        boolean result=false;
        for (String each : array) {
            if (each==element) {result=true;}

        }return result;
    }


///////////////////////////////////////////
    public static int[] addElement(int[] arr, int element) {
        int[] result = new int[arr.length + 1];
        int i = 0;
        for (int each : arr) {
            result[i++] = each;

        }
        result[i] = element;
        return result;
    }
    public static double[] addElement(double[] arr, double element) {
        double[] result = new double[arr.length + 1];
        int i = 0;
        for (double each : arr) {
            result[i++] = each;

        }result[i] = element;
        return result;

    }
    public static String[] addElement(String[] arr, String element) {
        String[] result = new String[arr.length + 1];
        int i = 0;
        for (String each : arr) {
            result[i++] = each;

        }
        result[i] = element;
        return result;


    }
    public static char[] addElement(char[] arr, char element) {
        char[] result = new char[arr.length + 1];
        int i = 0;
        for (char each : arr) {
            result[i++] = each;

        }
        result[i] = element;
        return result;


    }

////////////////////////////

    //returns the frequency of the given element from the given array
    public static int frequeancyOfElement(int[] array,int element){
        int count=0;
        for (int each : array) {
            if (each==element){count++;

            }

        }return count;

    }
    public static int frequeancyOfElement(double[] array,double element){
        int count=0;
        for (double each : array) {
            if (each==element){count++;

            }

        }return count;

    }
    public static int frequeancyOfElement(char[] array,char element){
        int count=0;
        for (char each : array) {
            if (each==element){count++;

            }

        }return count;


    }
    public static int frequeancyOfElement(String[] array,String element){
        int count=0;
        for (String each : array) {
            if (each.equals(element)){count++;

            }

        }return count;


    }


    ////////////
    public static int[] uniqueElement(int[] array){
        int[] result={};//burada int te hic element olmadigini(bos) belirtir bunun uzerinden islem yapilir
        for (int each : array) {
            if (ArraysUtulitiy.frequeancyOfElement(array,each)==1){
                //if the frequency is one,the element is unuque
                result=ArraysUtulitiy.addElement(result,each);
            }
        }return result;
    }
    //returns the unique elements of the array as a new array
    public static double[] uniqueElement(double[] array){
        double[] result={};//burada double te hic element olmadigini(bos) belirtir bunun uzerinden islem yapilir
        for (double each : array) {
            if (ArraysUtulitiy.frequeancyOfElement(array,each)==1){
                //if the frequency is one,the element is unuque
                result=ArraysUtulitiy.addElement(result,each);
            }

        }return result;
    }
    public static char[] uniqueElement(char[] array){
        char[] result={};//burada int te hic element olmadigini(bos) belirtir bunun uzerinden islem yapilir
        for (char each : array) {
            if (ArraysUtulitiy.frequeancyOfElement(array,each)==1){
                //if the frequency is one,the element is unuque
                result=ArraysUtulitiy.addElement(result,each);
            }
        }return result;
    }
    public static String[] uniqueElement(String[] array){
        String[] result={};//burada int te hic element olmadigini(bos) belirtir bunun uzerinden islem yapilir
        for (String each : array) {
            if (ArraysUtulitiy.frequeancyOfElement(array,each)==1){
                //if the frequency is one,the element is unuque
                result=ArraysUtulitiy.addElement(result,each);
            }
        }return result;
    }


    //////////////////////
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
////////////////////////////////////////////
 // merge the given two arrays and returns the new array
 /*public static int[] merge(int[] arr1,int[] arr2){
        /*int[] result=new int[arr1.length+ arr2.length];
        int j=0;
     for (int each : arr1) {
         result[j++]=each;
     }
     for (int each : arr2) {
         result[j++]=each;

////this also possible but we solve it with different solution
     }return result;
int[] result={};
     for (int each : arr1) {
         result=addElement(result,each);
              }
     for (int each : arr2) {
         result=addElement(result,each);

     }return result;
 }*/
  ///////////////////
  //////merge as well
   public static int[] merge(int[] arr1, int[] arr2) {
      int[] result = new int[arr1.length + arr2.length];
      int j = 0;
      for (int each : arr1) {
          result[j++] = each;
      }
      for (int each : arr2) {
          result[j++] = each;

////this also possible but we solve it with different solution
      }
      return result;
  }
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = new double[arr1.length + arr2.length];
        int j = 0;
        for (double each : arr1) {
            result[j++] = each;
        }
        for (double each : arr2) {
            result[j++] = each;

////this also possible but we solve it with different solution
        }
        return result;
    }
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = new char[arr1.length + arr2.length];
        int j = 0;
        for (char each : arr1) {
            result[j++] = each;
        }
        for (char each : arr2) {
            result[j++] = each;

////this also possible but we solve it with different solution
        }
        return result;
    }
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = new String[arr1.length + arr2.length];
        int j = 0;
        for (String each : arr1) {
            result[j++] = each;
        }
        for (String each : arr2) {
            result[j++] = each;

////this also possible but we solve it with different solution
        }
        return result;
    }

    //reverse the given array, returns a new array
    public static int[] revere(int[] array){
        int[] result=new int[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];

        }return result;
    }
    public static String[] revere(String[] array){
        String[] result=new String[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];

        }return result;
    }
    public static char[] revere(char[] array){
        char[] result=new char[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];

        }return result;
    }
    public static double[] revere(double[] array){
        double[] result=new double[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];

        }return result;
    }

    /////////////////////////////////

    //replace the elements of the array at given index with the new elements
    public static int[] replace(int[] arr, int index, int mewElement) {
        if (index<0||index> arr.length){
            System.out.println("invalid index "+index);
            System.exit(0);    }
        arr[index]=mewElement;
        return arr;
    }
    public static double[] replace(double[] arr, int index, double mewElement) {
        if (index<0||index> arr.length){
            System.out.println("invalid index "+index);
            System.exit(0);    }
        arr[index]=mewElement;
        return arr;
    }
    public static char[] replace(char[] arr, int index, char mewElement) {
        if (index<0||index> arr.length){
            System.out.println("invalid index "+index);
            System.exit(0);    }
        arr[index]=mewElement;
        return arr;
    }
    public static String[] replace(String[] arr, int index, String mewElement) {
        if (index<0||index> arr.length){
            System.out.println("invalid index "+index);
            System.exit(0);    }
        arr[index]=mewElement;
        return arr;
    }
    //////////////

    //replaces all the matching old values of the array with new value
    public static int[] replaceAll(int[] array, int oldElement,int newElement){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldElement) {
                array[i]=newElement;
            }
        }return array;


    }
    public static double[] replaceAll(double[] array, double oldElement,double newElement){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldElement) {
                array[i]=newElement;
            }
        }return array;


    }
    public static char[] replaceAll(char[] array, char oldElement,char newElement){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldElement) {
                array[i]=newElement;
            }
        }return array;


    }
    public static String[] replaceAll(String[] array, String oldElement,String newElement){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldElement)) {
                array[i]=newElement;
            }
        }return array;


    }
    //////////////////////////////////////////////////

    //{1,2,1,2,11,1,3,4,3}
    public static int[] removeDuplicate(int[] array){
        int[] result={};
        for (int each : array) {
            if (!ArraysUtulitiy.contain(result,each)){
                result=ArraysUtulitiy.addElement(result,each);
            }

        }return result;

    }
    public static double[] removeDuplicate(double[] array){
        double[] result={};
        for (double each : array) {
            if (!ArraysUtulitiy.contain(result,each)){
                result=ArraysUtulitiy.addElement(result,each);
            }

        }return result;

    }
    public static char[] removeDuplicate(char[] array){
        char[] result={};
        for (char each : array) {
            if (!ArraysUtulitiy.contain(result,each)){
                result=ArraysUtulitiy.addElement(result,each);
            }

        }return result;

    }
    public static String[] removeDuplicate(String[] array){
        String[] result={};
        for (String each : array) {
            if (!ArraysUtulitiy.contain(result,each)){
                result=ArraysUtulitiy.addElement(result,each);
            }

        }return result;

    }
    ///////////////////////
    public static boolean isStrongPassword(String password){
        boolean r1=password.length()>=8&&!password.contains(" ");
        boolean r2=false;//has Uppercase
        boolean r3=false;//has LowerCase
        boolean r4=false;//has special char
        boolean r5=false;//has digit
        char[] chars=password.toCharArray();
        for (char each : chars) {
            if (Character.isUpperCase(each)){
                r2= true;
            } else if (Character.isLowerCase(each)) {
                r3=true;
            } else if (Character.isDigit(each)) {
                r5=true;
            }else {r4=true;}
        }
        boolean isStrongPasssword=r1&&r2&&r3&&r4&&r5;
        // System.out.println("isStrongPasssword = " + isStrongPasssword);
        return isStrongPasssword;
    }






}
