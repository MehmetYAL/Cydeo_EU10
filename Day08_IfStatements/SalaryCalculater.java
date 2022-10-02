package Day08_IfStatements;

public class SalaryCalculater {

    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;
        //---------------------
        //salarybefore tax
        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double statetax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = statetax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;


        System.out.println("Gross pay is $" + salaryBeforeTax);
        System.out.println("State tax = $" + statetax);
        System.out.println(" Federal tax =$" + federalTax);
        System.out.println("Total tax=$" + totalTax);
        System.out.println("Net Income = $" + salaryAfterTax);

    }

}

