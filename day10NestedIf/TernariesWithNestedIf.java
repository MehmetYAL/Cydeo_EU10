package day10NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int s=55;
        String result =(s>=0&&s<=100)?(s>=60)?"passed":"Failed":"Invalid Score";
        System.out.println("result = " + result);
    }
}
