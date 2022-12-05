package Day37_Inheritance.phoneTask;

public class Nokia extends Phone{
    public Nokia( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }
    public void selfDeefence(){
        System.out.println("you can use"+brand+" "+model +" as self defense");
    }
}
/*
Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:

					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()
 */