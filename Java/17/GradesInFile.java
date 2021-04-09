import java.io.*;
import java.util.*;

public class GradesInFile {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(new File("grades.txt"));
        PrintWriter writer = new PrintWriter(new FileOutputStream("results.txt"), true);
        int tmp;
        while (reader.hasNextLine()){
            tmp = Integer.parseInt(reader.nextLine());
            if (tmp == 10) {
                writer.println(tmp);
            } else {
                writer.println(tmp+1);
            }
        }
        printResults("results.txt");
    }

    public static void printResults(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        boolean rowsLeft = true;
        String readRow;

        System.out.println("Updated grades: ");

        while(rowsLeft) {
            readRow = reader.readLine();
            if(readRow == null) {
                rowsLeft = false;
            } else {
                System.out.print(readRow);
                System.out.println(" ");
            }
        }
        reader.close();
    }
}