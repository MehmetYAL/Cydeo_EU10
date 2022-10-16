package Day16_Loop_String;

import java.util.Scanner;

public class frequencyOfChar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter string and char");
String str=input.next();
char ch=input.next().charAt(0);
int fre=0;
        for (int i = 0; i <str.length() ; i++) {
            char eachChar=str.charAt(i);
            if (ch==eachChar){fre++;}
        }
        System.out.println(fre);
    /*
    Write a program that asks user to entera string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
     */
    }
}
