import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        do {
            System.out.print("Type in the height: ");
            num1 = sc.nextInt();
            System.out.print("Type in the width: ");
            num2 = sc.nextInt();
            if ((num1 <= 0) || (num2 <= 0)){
                System.out.println("Invalid height or width value");
            }
        } while ((num1 <= 0) || (num2 <= 0));
        sc.close();

        for (int i = 0; i < num1; i++) {
            for (int u = 0; u < num2; u++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}