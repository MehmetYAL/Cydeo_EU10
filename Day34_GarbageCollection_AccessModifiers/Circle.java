package Day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi=3.14;
    public static String name;

    public static ArrayList<Integer> numbers;

    public Circle(double radius){
        this.radius=radius;
    }
    static {
        //radius=5-----can not put instance
        pi=3.14; //can only accept static
        name="cicle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }
}
