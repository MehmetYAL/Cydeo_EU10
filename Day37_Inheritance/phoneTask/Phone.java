package Day37_Inheritance.phoneTask;

public class Phone {//only contains the common features of all sub class
    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery=true;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;

    }
    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand+" "+model+" is texting to "+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", hasBattery='" + hasBattery + '\'' +
                '}';
    }
}
/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
Add Constructor  to set all the fields
				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */