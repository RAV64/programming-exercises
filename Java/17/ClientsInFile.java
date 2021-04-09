import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ClientsInFile {
    public static void main(String[] args) throws IOException {

        Person[] people = new Person[100];

        int persons = readInfo(people);

        for (int i = 0; i < persons; i++) {
            System.out.println(people[i]);
        }
    }

    private static int readInfo(Person[] people) throws IOException {
        int i = 0;
        Scanner file = new Scanner(new File("grades.txt"));
        while (file.hasNextLine()) {
            people[i] = new Person(file.nextLine());
            i++;
        }
        return i;
    }

    static class Person {
        private final String info;

        Person(String person) {
            this.info = person;
        }

        public String toString() {
            return info;
        }
    }
}