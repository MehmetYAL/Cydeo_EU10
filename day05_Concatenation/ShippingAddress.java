package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Mehmet Yalcin",
        buildingNumber = " 2015478 ",
        streetName =" Yellow School Street ",
                city = " CheChe ",
                state = " NA ",
                zipcode = " 123456Z ";
        String address =   name + " \n" + buildingNumber + " \n"+ streetName +
        "\n" + city + " ," + state + "" + zipcode ;
        System.out.println(" " + name + " \n" + buildingNumber + " \n"+ streetName +
                "\n" + city + " ," + state + "" + zipcode );
        System.out.println(address);




    }
}
