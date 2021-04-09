import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StudentsInfile {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("students.txt"));

        System.out.println("Course students: ");
        while (file.hasNextLine()) {
            System.out.println(file.nextLine());
        }
        file.close();
    }
}
