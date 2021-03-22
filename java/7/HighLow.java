import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int number1, number2, number3, high, low;
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the first integer: ");
        number1 = reader.nextInt();

        System.out.print("Type in the second integer: ");
        number2 = reader.nextInt();

        System.out.print("Type in the third integer: ");
        number3 = reader.nextInt();

        high = high(number1, number2, number3);
        low = low(number1, number2, number3);

        System.out.print("Highest number was " + high);
        System.out.print(" and the lowest was " + low + "\n");
    }

    private static int high(int n1, int n2, int n3) {
        if (n1 > n2) {
            if (n1 > n3) {
                return n1;
            } else {
                return n3;
            }
        } else {
            if (n2 > n3) {
                return n2;
            } else {
                return n3;
            }
        } // return n1 > n2 ? Math.max(n1, n3) : Math.max(n2, n3);
    }

    private static int low(int n1, int n2, int n3) {
        if (n1 < n2) {
            if (n1 < n3) {
                return n1;
            } else {
                return n3;
            }
        } else {
            if (n2 < n3) {
                return n2;
            } else {
                return n3;
            }
        } // return n1 < n2 ? Math.min(n1, n3) : Math.min(n2, n3);
    }
}