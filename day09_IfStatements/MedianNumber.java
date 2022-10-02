package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {


    // can find the number between three different given int

    int a = 10, b=20, c=30;
    boolean aIsMedian = (a>b && a<c) || (a>c && a<b);
    boolean bIsMedian = ( b>c && b<a )|| (b>a && b<c);
    boolean cIsMedian = !aIsMedian && !bIsMedian; // same ( c>a && c<b )|| (c>b && c<a);
    if ( aIsMedian){
        System.out.println(a+ " is median number");
    }
    if (bIsMedian){
        System.out.println(b + " is median number");
    }
    if (cIsMedian){
        System.out.println( c + " is median number");
    }


if (a<b && a>c){
    System.out.println();
}

    }
}
