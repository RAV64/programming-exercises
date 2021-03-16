import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in a floating point number: ");
        double num = sc.nextDouble();
        sc.close();
        System.out.print("The absolute value of the given number is " + ((num<0) ? (-num) : (num)));
    }
}