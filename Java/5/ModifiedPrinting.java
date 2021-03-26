import java.util.Scanner;

public class ModifiedPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in your first name: ");
        String name = sc.next();
        sc.close();
        System.out.println("\n" +
                "\n" +
                "Hi, \"" + name + "\"\n" +
                "\tThe name of this exercise is 'Modifying printing'.\n" +
                "\tTabulator, line change and quotations have already been used in this exercise.\n" +
                "\tForward slash (\\) is also usable in printing.\n" +
                "\n" +
                "\n" +
                "\t\t*** End of exercise ***");
    }
}