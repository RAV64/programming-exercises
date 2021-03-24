import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount of days: ");
        double[] days = new double[sc.nextInt()];
        double total = 0;
        for (int i = 0; i < days.length; i++) {
            System.out.print("Type in work hours of day " + (i + 1) + ": ");
            days[i] = sc.nextDouble();
            total += days[i];
        }
        System.out.println("\nTotal of work hours: " + total);
        System.out.println("average work day length: " + (total / days.length));
        System.out.print("Inputted work hours:");
        for (double day : days) {
            System.out.print(" " + day);
        }
    }
}
