import java.util.Scanner;

public class DecimalCalculations {
    public static void main(String[] args) {
        float num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in the first number: ");
        num1 = sc.nextFloat();
        System.out.print("Type in the second number: ");
        num2 = sc.nextFloat();
        sc.close();
        System.out.println("Result of the multiplication: " + (num1 * num2));
        System.out.println("Result of the division: " + (num1 / num2));
    }
}
