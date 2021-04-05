import java.util.InputMismatchException;
import java.util.Scanner;

public class ownException {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int testedNumber = 0;
        boolean inputCorrect;
        do {
            try {
                System.out.print("Type in the number for testing: ");
                testedNumber = reader.nextInt();
                inputCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("You did not type in an integer!");
                inputCorrect = false;
                reader.nextLine();
            }
        } while (!inputCorrect);

        try {
            testValue(testedNumber);
            System.out.println("Value was between 5 and 10.");
        } catch (SmallException e) {
            System.out.println("SmallException caught!");
            printErrorReport(e);
        } catch (BigException e) {
            System.out.println("BigException caught!");
            printErrorReport(e);
        }
    }

    public static void testValue(int testedNumber) throws SmallException, BigException {
        if (testedNumber < 5) {
            throw new SmallException("Value was lower than 5.");
        } else if (testedNumber > 10) {
            throw new BigException("Value was higher than 10.");
        }
    }

    private static void printErrorReport(Exception e) {
        System.out.println(e.getMessage());
    }

    private static class SmallException extends Exception {
        public SmallException(String s) {
            super(s);
        }
    }

    private static class BigException extends Exception {
        public BigException(String s) {
            super(s);
        }
    }
}