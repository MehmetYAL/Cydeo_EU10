package Day34_GarbageCollection_AccessModifiers;

public class AccessModifierTest {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defautlData);
       // System.out.println(AccessModifiers.privateData); is
        //not visible with n other class

        AccessModifiers.method1();
        AccessModifiers.method2();
     //   AccessModifiers.method3(); can not be used in diffrent package
    }
}
