import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int rows, columns;
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the number of rows: ");
        rows = reader.nextInt();
        System.out.print("Type in the number of columns: ");
        columns = reader.nextInt();

        int[][] matrix;

        matrix = askInfo(rows, columns);
        printMatrix(matrix);
        countSum(matrix);
    }

    private static int[][] askInfo(int rows, int columns) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Type in the element " + (j + 1) + " of the row  " + (i + 1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }


    private static void printMatrix(int[][] matrix) {
        System.out.println("\nMatrix:");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    private static void countSum(int[][] matrix) {
        int total = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                total += anInt;
            }
        }
        System.out.println("\nSum of the elements of the matrix: " + total);
    }
}