package HomeWork;

public class Day11_task3_Browser {
    public static void main(String[] args) {
        String Browser="Chrome";
        String result="";
        switch (Browser){
            case "Chrome":
                result="Chrome is opening";
                break;
            case "firefox": result="Firefox is opening";
            break;
            case "safari": result="Safari is opening";
            break;
            case "opera": result="opera is opening";
            break;

            default:
                System.out.println("Invalid Browser");
        }
        System.out.println(result);


    }
}
