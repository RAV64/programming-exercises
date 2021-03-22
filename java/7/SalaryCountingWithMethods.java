import java.util.Scanner;

public class SalaryCountingWithMethods {
    public static void main(String[] args) {
        double hours, salaryPerHour, taxPercent, taxlessSalary, taxPart;

        hours = askHours();
        salaryPerHour = askSalaryPerHour();
        taxPercent = askTaxPercent();

        taxlessSalary = countTaxlessSalary(hours, salaryPerHour);

        taxPart = taxlessSalary * taxPercent / 100;

        System.out.println("\nSalary before taxes: " + taxlessSalary);
        System.out.println("Tax part of the salary: " + taxPart);
        System.out.println("Salary after taxes: " + (taxlessSalary - taxPart));
    }

    private static double countTaxlessSalary(double hours, double salaryPerHour) {
        return hours * salaryPerHour;
    }

    private static double askTaxPercent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in tax percent: ");
        return sc.nextDouble();
    }

    private static double askSalaryPerHour() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in salary per hour: ");
        return sc.nextDouble();
    }

    private static double askHours() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the number of work hours: ");
        return sc.nextDouble();
    }
} // Scanner declared inside methods because of limitations of the exercise
