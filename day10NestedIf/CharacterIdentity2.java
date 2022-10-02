package day10NestedIf;

public class CharacterIdentity2 {
    public static void main(String[] args) {
        char ch = '@';
        //digit---alphabetic--speciall character
        if (ch >= '0' && ch <= '9')// '0' yerine 48 ve '9' yerine  57
        {
            System.out.println("Digit");
        } else if ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
            System.out.println("Alphabetic");

        }else System.out.println("Special caharacter");
    }
}