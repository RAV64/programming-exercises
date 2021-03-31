import java.util.Scanner;

public class GasMeterTest {
    public static void main(String[] args) {
        int answer = 1;
        boolean valueCorrect = true;
        GasMeter meter = new GasMeter();

        while (valueCorrect) {
            Scanner reader = new Scanner(System.in);

            System.out.print("What do you want: 1=95, 2=98, 3=Diesel " +
                    "(type any other number to quit): ");
            answer = reader.nextInt();

            if(answer >= 1 && answer <= 3) {
                System.out.print("How much do you want to refuel: ");
                double amount = reader.nextDouble();
                meter.refuel(answer, amount);
            } else {
                valueCorrect = false;
            }
        }

        GasMeter.totalUsed();
        GasMeter.totalUsed95();
        GasMeter.totalUsed98();
        GasMeter.totalUsedDi();
    }
}
class GasMeter {
    private static double fuel = 0;
    private static double fuel95 = 0;
    private static double fuel98 = 0;
    private static double fuelDi = 0;

    public void refuel(int answer, double amount) {
        switch (answer) {
            case 1:
                fuel95 += amount;
                break;
            case 2:
                fuel98 += amount;
                break;
            case 3:
                fuelDi += amount;
                break;
        }
        fuel = fuel95 + fuel98 + fuelDi;
    }

    public static void totalUsed() {
        System.out.println("Total used fuel: " + fuel);
    }

    public static void totalUsed95() {
        System.out.println("Total used 95 octane fuel: " + fuel95);
    }

    public static void totalUsed98() {
        System.out.println("Total used 98 octane fuel: " + fuel98);
    }

    public static void totalUsedDi() {
        System.out.println("Total used diesel fuel: " + fuelDi);
    }
}