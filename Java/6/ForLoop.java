import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in an integer: ");
        int num1 = sc.nextInt();
        sc.close();
        if (num1 < 0) {
            System.out.println("Input is not a positive integer.");
        } else {
            for (int i = num1; i > -1; i--) {
                System.out.println(i);
            }
        }
    }
}