import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in an integer: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Number " + num + " is " + ((num % 2 == 0) ? "even." : "odd."));
    }
}
