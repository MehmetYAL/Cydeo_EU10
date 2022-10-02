package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {


// age: 38 years old
        byte age = 38;

        // weight: 160 pounds
        // byte weight = 160 // 160 is out of byte`range
        // byte num = -129 // -129 is out of byte` range
        short weight = 160; // 160 is within the range of short

        //salary: 100000$
        // short salary= 100000; // 100000 is out of short` range
        int salary =100_000; // int is prefered data data typ for integer numbers
        long asset=3_333_333_333L;

        //tax:0.26
        //#
        char ch1 = '#';
        char ch2 = 35;
        char ch3= 47;
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch3 = " + ch3);

    }
}
