package Day32_CustomClass_Constructors;

public class CarObjects {
    public static void main(String[] args) {
        Car car1=new Car("Toyota");
        Car car2=new Car("Honda","City");
        Car car3=new Car("Lexus","RX",2018);
        Car car4=new Car("TOGG","Anadol",2023,80000);
        Car car5=new Car("Tesla","Model3",2022,950000,"Black");

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.out.println("car4 = " + car4);
        System.out.println("car5 = " + car5);
    }
}
