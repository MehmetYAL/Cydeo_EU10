package Day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {
    static {
        System.out.println("static block");

    }
    public Constructor_vs_StaticBlock(){
        System.out.println("constructor");

    }

    public static void main(String[] args) {
       new Constructor_vs_StaticBlock();
       new Constructor_vs_StaticBlock();
       new Constructor_vs_StaticBlock();
    }
}
