package Day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setInfo("Toyota","Corolla","bordo",2022,50_000.00);
        System.out.println(car1);

        Car car2=new Car();
        car2.setInfo("BMW","520i","Blue",2021,70000);
        System.out.println(car2);

        Car car3=new Car();
        car3.setInfo("Audi","A6","Black",2019,65000);
        System.out.println(car3);

        //Car[] cars={car1,car2,car3};
        ArrayList<Car> carsList=new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each:carsList){
            System.out.println(each.brand+" : "+each.price);
            System.out.println("=============================================");
            carsList.removeIf(p-> p.brand.equals("BMW")&& p.year>=2005&&p.year<=2008);
            carsList.removeIf(p-> p.brand.equals("Toyota") && p.year>=1995&&p.year<=1997);
        }


    }
}
