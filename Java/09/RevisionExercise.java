import java.util.Scanner;

public class RevisionExercise {
    public static void main(String[] args) {

        int[] tempArray = new int[100];
        System.out.println("Type in numbers. Type zero to quit.");
        int amountOfNumbers = askInfo(tempArray);

        int[] realArray = new int[amountOfNumbers];
        copyInfo(realArray, tempArray);

        setArray(realArray);

        printArray(realArray);
    }

    private static void setArray(int[] realArray) {
        int tempNum;
        for (int i = 0; i < realArray.length - 1; i++) {
            for (int j = i + 1; j < realArray.length; j++) {
                if (realArray[i] < realArray[j]) {
                    tempNum = realArray[i];
                    realArray[i] = realArray[j];
                    realArray[j] = tempNum;
                }
            }
        }
    }

    private static void copyInfo(int[] realArray, int[] tempArray) {
        System.arraycopy(tempArray, 0, realArray, 0, realArray.length);
    }

    private static int askInfo(int[] tempArray) {
        Scanner sc = new Scanner(System.in);
        int nums = 0;
        int newNum;
        boolean quit = true;
        do {
            System.out.print(nums + 1 + ". number: ");
            newNum = sc.nextInt();
            if (newNum == 0) {
                quit = false;
            } else {
                tempArray[nums] = newNum;
                nums++;
            }
        } while (quit);
        return nums;
    }

    public static void printArray(int[] realArray) {
        System.out.println("\nOrdered array: ");
        for (int j : realArray) {
            System.out.println(j);
        }
    }
}