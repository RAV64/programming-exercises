import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program calculates the average of inputted grades.");
        System.out.println("Finish with a negative integer.\n");

        List<Float> nums = new ArrayList<>();
        boolean finished = false;
        do {
            System.out.print("Input a grade (4-10): ");
            nums.add(sc.nextFloat());
            if (nums.get(nums.size() - 1) < 0) {
                nums.remove(nums.get(nums.size() - 1));
                finished = true;
            } else if (nums.get(nums.size() - 1) < 4 || nums.get(nums.size() - 1) > 10) {
                System.out.println("Invalid grade!");
                nums.remove(nums.get(nums.size() - 1));
            }
        } while (!finished);

        if (nums.size() > 0) {
            float total = 0;
            int i;
            for (i = 0; i < nums.size(); i++) {
                total += nums.get(i);
            }
            System.out.println("\n" + i + " grades inputted.");
            System.out.println("Average of the grades: " + (total / i));
        } else {
            System.out.println("You did not input any grades.");
        }
    }
}
