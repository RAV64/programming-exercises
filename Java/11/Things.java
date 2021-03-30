import java.util.Scanner;

public class Things {
    public static void main(String[] args) {
        String characterString;
        Scanner reader = new Scanner(System.in);
        PrintingClass printer = new PrintingClass();
        System.out.print("Type in the character string for printing: ");
        characterString = reader.nextLine();
        printer.Print(characterString);
    }
}

class PrintingClass {
    public void Print(String txt) {
        System.out.println(txt);
    }
}