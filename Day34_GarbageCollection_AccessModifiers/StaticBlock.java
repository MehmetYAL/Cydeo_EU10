package Day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("main method");
    }
    static {//runs first before anything anf runs only one timess
        System.out.println("static block");

    }
}
