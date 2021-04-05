import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionInAddition {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstNumber = 0, secondNumber = 0, result;
        boolean inputCorrect = true;

        try {
            System.out.print("Type in the first number: ");
            firstNumber = reader.nextInt();

            System.out.print("Type in the second number: ");
            secondNumber = reader.nextInt();

        } catch (InputMismatchException e1) {
            inputCorrect = false;
        }

        if (inputCorrect) {
            result = firstNumber + secondNumber;
            System.out.println("Result: " + result);
        } else {
            System.out.println("You did not type in an integer!");
        }
    }
}