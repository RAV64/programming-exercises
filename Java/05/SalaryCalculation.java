import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in the amount of work hours: ");
        double wHours = sc.nextDouble();
        System.out.print("Type in the salary per hour: ");
        double hourly = sc.nextDouble();
        System.out.print("Type in the tax percent: ");
        double tax = sc.nextDouble();
        sc.close();
        System.out.println("Salary before taxes: " + (wHours * hourly));
        System.out.println("Amount of tax: " + (tax / 100 * (wHours * hourly)));
        System.out.println("Salary after taxes: " + ((wHours * hourly) - (tax / 100 * (wHours * hourly))));
    }
}