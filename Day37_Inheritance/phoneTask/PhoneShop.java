package Day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone=new Iphone("iphone12","6.7inches",599,"black");
        Samsung samsung1=new Samsung("galaxy19","7inch",550,"white");
        Nokia nokia1=new Nokia("Brick","4 inches",99,"black-gray");

        System.out.println(iphone);
        System.out.println(samsung1);
        System.out.println(nokia1);

        iphone.call(911);
        iphone.faceTime(123466);
        iphone.faceTime("abg@gmail.com");

        System.out.println("===============================");
        samsung1.call(789987);
        samsung1.freeze();
        System.out.println("===================================");
        nokia1.call(456654);
        nokia1.text(87894);
        nokia1.selfDeefence();


    }
}
