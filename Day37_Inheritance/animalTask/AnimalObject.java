package Day37_Inheritance.animalTask;

public class AnimalObject {
    public static void main(String[] args) {
        Dog dog1=new Dog("Alex","Husky",'M',3,"xl","White");
        System.out.println(dog1);
        dog1.bark();

        Cat cat1=new Cat("Love","british",'F',2,"large","white");
        System.out.println(cat1);

        Parrot parrot1=new Parrot("King","Macav",'M',5,"small","blue");
        parrot1.sing();
        //parrot1.bark();  not able to call another class method
    }
}
