import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GradesInFile1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("grades.txt"));
        String readRow;
        double i = 0, avg = 0;
        boolean rowsLeft = true;
        System.out.println("Grades: ");
        while (rowsLeft) {
            readRow = reader.readLine();
            if (readRow == null) {
                rowsLeft = false;
                reader.close();
            } else {
                System.out.println(readRow);
                avg += Double.parseDouble(readRow);
                i++;
            }
        }
        System.out.println("Average: " + avg / i);
    }
}
