package day14_String;

public class EmailDomain {
    public static void main(String[] args) {

        String email="cyde.school@gmail.com"; //get domain from the email
        String email1=email.substring(email.indexOf("@")+1,email.indexOf(".c"));
        System.out.println("email1 = " + email1);
        /* veya find first begining index and than ending index
        int beginingIndex=email.indexOf("@")+1;
        int endIndex=email.lastindexof(".");
        String domain=email.subString(beginingIndex,endingIndex)
         */
        System.out.println("-----------------------------------------------");
        String str1="Java is fun, Java is cool, I love Java";
        //String s1; java is fun
        String s1=str1.substring(0,10+1);
        System.out.println("s1 = " + s1);

        int beg=str1.indexOf(" J");
        int end=str1.lastIndexOf(",");
        System.out.println("beg = " + beg);
        System.out.println("end = " + end);

        String str2=str1.substring(beg,end);
        System.out.println(str2);

        String s3=str1.substring(str1.indexOf(" I"),str1.lastIndexOf("a")+1);
        System.out.println("s3 = " + s3);



    }
}
