package Day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {
    public static int publicData=100;
    static int defautlData=200; // access midifier:default
    private static int privateData=300; // only available in same pakage

    public static void method1(){
        System.out.println("public");
            }
    static void method2(){
        System.out.println("default");
    }

private static void method3(){
    System.out.println("private");
}
    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(defautlData);
        System.out.println(privateData);
    }
}
