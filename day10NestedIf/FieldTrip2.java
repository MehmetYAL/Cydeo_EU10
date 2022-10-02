package day10NestedIf;

public class FieldTrip2 {
    public static void main(String[] args) {
        int grade = 2;
        String location = "";
        int groupNumber = 0;
        String teacher = "";
        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                location = "Apple Orchard";
                groupNumber = 3;
                teacher = "Ms.Smith";
            } else if (grade == 2) {
                location = "zoo";
                groupNumber = 7;
                teacher = "MrLee";

            } else if (grade == 3) {
                location = "Aquarium";
                groupNumber = 5;
                teacher = "Ms Wilson";

            } else if (grade == 4) {
                location = "";
                groupNumber = 5;
                teacher = "Ms Wilson";

            } else {
                System.out.println("Invalid Grade");
            }
            System.out.println("location"+location+"\nnumber of groups"+ groupNumber+"\n teacher in charge "+teacher);
        }
    }}