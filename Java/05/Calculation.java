import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Type the second number: ");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("Sum of the numbers you typed is " + (num1 + num2));
    }
}