package Day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.setInfo("max","husky",'F',2,"medium","white");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        System.out.println(dog);

        Cat cat=new Cat();
        cat.setInfo("tarcin","british",'F',5,"large","black");
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.scratch();
        cat.meow();
        System.out.println(cat);

        Tiger tiger=new Tiger();
        tiger.setInfo("bengal","china",'M',8,"Xlarge","black");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.hunt();
        tiger.roar();
        System.out.println(tiger);
    }
}
