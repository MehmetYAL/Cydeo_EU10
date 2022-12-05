package Day32_CustomClass_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){

        System.out.println("default constructor ");
    }
    public ConstructorCalls(int a){
        this();//default constructor
        System.out.println("constructor with int argument");
            }
            public ConstructorCalls(String str){
       // this();
        this(10);// you can call only one constructor
                System.out.println("constructor with string argument");}

    public static void main(String[] args) {
        ConstructorCalls obj1=new ConstructorCalls();
        System.out.println("====================================");
       ConstructorCalls obj2=new ConstructorCalls(10);
        System.out.println("====================================");
        ConstructorCalls obj3=new ConstructorCalls("java");

    }
}
