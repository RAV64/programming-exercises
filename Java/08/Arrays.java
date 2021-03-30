public class Arrays {
    public static void main(String[] args) {
        int[] numberArray = {4, 7, 8, 2, 8, 3, 7, 1 };
        String[] nameArray = {"May", "Peggy", "Tina", "Sue" };
        int[][] matrix = {{2}, {4, 6}, {8, 10, 12}, {14, 16}, {18}};

        System.out.print("Number in array: ");
        for (int j : numberArray) {
            System.out.print(j + " ");
        }

        System.out.print("\n\nNames in array: ");
        for (String s : nameArray) {
            System.out.print(s + " ");
        }

        System.out.println("\n\nMatrix elements: ");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("\t");
        }
    }
}