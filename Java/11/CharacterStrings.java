import java.util.Scanner;
public class CharacterStrings {
    public static void main(String[] args) {
        String characterString;
        Scanner reader = new Scanner(System.in);

        Printer printerObject = new Printer();

        System.out.print("Type in a character string: ");
        characterString = reader.nextLine();

        characterString = printerObject.bigSmall(characterString);
        printerObject.reverseSpace(characterString);
    }
}
class Printer {
    Scanner sc = new Scanner(System.in);

    public String bigSmall(String cs) {
        System.out.print("Do you want upper case or lower case? (upper/lower): ");
        String input = sc.nextLine();
        if (input.equals("lower")) {
            return cs.toLowerCase();
        } else if (input.equals("upper")) {
            return cs.toUpperCase();
        }
        return cs;
    }

    public void reverseSpace(String cs) {
        System.out.print("How would you like the string to be printed? (reverse/separated): ");
        String input = sc.nextLine();
        System.out.print("\nHere is your character string: ");
        if (input.equals("reverse")) {
            for (int i = cs.length() - 1; i >= 0; i--) {
                System.out.print(cs.charAt(i));
            }
        } else if (input.equals("separated")) {
            for (int i = 0; i < cs.length(); i++) {
                System.out.print(cs.charAt(i) + " ");
            }
        } else {
            System.out.print(cs);
        }
    }
}