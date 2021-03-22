import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        double speed, distance, time;

        distance = askDistance();
        speed = askSpeed();
        time = countTime(distance, speed);

        System.out.println("Time needed to complete the trip is " + time + " hours.");
    }

    private static double countTime(double distance, double speed) {
        return distance / speed;
    }

    private static double askSpeed() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in your average speed (km/h): ");
        return sc.nextDouble();
    }

    private static double askDistance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the length of the trip (km): ");
        return sc.nextDouble();
    }
} // Scanner declared inside methods because of limitations of the exercise