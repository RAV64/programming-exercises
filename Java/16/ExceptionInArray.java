import java.util.Scanner;
import java.util.*;

public class ExceptionInArray {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int elementNumber;
        int[] array = {4,5,8,9,1,32,5,8,32,7,9,5};

        System.out.print("Which element to print? ");

        try {
            elementNumber = reader.nextInt();
            System.out.println(array[elementNumber-1]);
        } catch (IndexOutOfBoundsException e1) {
            System.out.println("Invalid index!");
        } catch (InputMismatchException e2) {
            System.out.println("You did not type in an integer!");
        }
    }
}