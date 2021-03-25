import java.util.*;

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

    private static int askInfo(int[] tempArray) {
        return 0;
    }

    private static void copyInfo(int[] realArray, int[] tempArray) {
        
    }

    private static void setArray(int[] realArray) {

    }

    public static void printArray(int[] realArray ) {
        System.out.println("\nOrdered array: ");
        for(int i = 0; i < realArray .length; i++) {
            System.out.println(realArray [i]);
        }
    }
}