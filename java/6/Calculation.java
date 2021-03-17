import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose from the following calculations:\n" +
                "1: subtraction\n" +
                "2: addition\n" +
                "3: multiplication\n" +
                "4: division\n" +
                "5: remainder\n" +
                "\n" +
                "Make your choice: ");
        int choice = sc.nextInt();
        int num1 = 0;
        int num2 = 0;

        if (choice<=5 && choice>=1) {
            System.out.print("Type in the first number: ");
            num1 = sc.nextInt();
            System.out.print("Type in the second number: ");
            num2 = sc.nextInt();
        }

        sc.close();
        switch (choice) {
            case 1:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 2:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println(num1 + " / " + num2 + " = " + ((float) num1 / num2));
                break;
            case 5:
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid choice.");
                break;

        }
        /*switch (choice) {
            case 1 -> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            case 2 -> System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            case 3 -> System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            case 4 -> System.out.println(num1 + " / " + num2 + " = " + ((float) num1 / num2));
            case 5 -> System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
            default -> System.out.println("Invalid choice.");
        }*/

    }
}
