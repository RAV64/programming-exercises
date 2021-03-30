import java.util.Scanner;

public class MultiplicationChart {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = reader.nextInt();
        count(number);
    }

    private static void count(int number) {
        System.out.println("Multiplication chart of the number " + number);
        for (int i = 1; i < 11; i++) {
            System.out.println(i * number);
        }
    }
}