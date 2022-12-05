package Day37_Inheritance.animalTask;

public class Parrot extends Animal {
    public Parrot(String name, String bread, char gender, int age, String size, String color) {
        super(name, bread, gender, age, size, color);
    }
    public void sing(){
        System.out.println( name+" is singing");
    }
}
