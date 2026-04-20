import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra, da, tax = 0;

        if (basic <= 20000) {
            hra = 0.20 * basic;
        } else {
            hra = 0.30 * basic;
        }

        da = 0.80 * basic;

        double gross = basic + hra + da;

        if (gross > 50000) {
            tax = 0.10 * gross;
        }

        double net = gross - tax;

        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Gross Salary = " + gross);
        System.out.println("Tax = " + tax);
        System.out.println("Net Salary = " + net);

        sc.close();
    }
}