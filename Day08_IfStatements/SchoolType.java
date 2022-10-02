package Day08_IfStatements;

public class SchoolType {
    public static void main(String[] args) {
        /*
       rade level and types are:
1-5: Elementary school
6-8: Middle school
//9-12: High school
//13-16: College
17-18: Grad School
            */
        byte gradelevel = 18;

        boolean Elementaryschool = gradelevel >= 1 && gradelevel <= 5;
        boolean middleschool = gradelevel >= 6 && gradelevel <= 8;
        boolean highschool = gradelevel >= 9 && gradelevel <= 12;
        boolean college = gradelevel >= 13 && gradelevel <= 16;
        boolean Gradscool = gradelevel >= 16 && gradelevel <= 18;

        if (Elementaryschool) {
            System.out.println("scool type is Elementaryschool");

        }
        if (middleschool) {
            System.out.println("scool type is middleschool");

        }
        if (highschool) {
            System.out.println("scool type is highscool");
        }
        if (highschool) {
            System.out.println("scool type is highsccol");
        } else {
            System.out.println("scool type is Grade");
        }
    }
}