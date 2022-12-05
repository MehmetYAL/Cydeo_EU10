package HomeWork;

public class CharacterIdentity {
    public static void main(String[] args) {
        int Character=125;
        if (Character>=65&&Character<=90||Character>=97&&Character<=122)
            System.out.println("Alphabetic Character");
        else if (Character >=0 && Character<=47|| Character>=123&&Character<=127) {
            System.out.println(" Speciall Character");
                 }else
        {
            System.out.println("Digit Character");}

    }
    /*

   ----------- THIS IS THE CORRECT ONE--------------------------
     char character = 't';
        String typeOfCharacter = "";
        if (character >='0' && character <= '9') {
            typeOfCharacter = "Digital Character";
        } else if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
            typeOfCharacter = "Alphabetic Character";
        } else {
            typeOfCharacter = "Special Character";
        }
        System.out.println(typeOfCharacter);
    }
}
/*
Alphabetic Character

     */

}
