import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many floating point numbers do you want to type: ");
        int numAmount = sc.nextInt();
        double[] nums = new double[numAmount];
        for (int i = 0; i < numAmount; i++) {
            System.out.print("Type in " + (i + 1) + ". number: ");
            nums[i] = sc.nextDouble();
        }
        System.out.println("\nGiven numbers in reverse order: ");
        for (int i = 0; i < numAmount; i++) {
            System.out.println(nums[nums.length - 1 - i]);
        }
    }
}