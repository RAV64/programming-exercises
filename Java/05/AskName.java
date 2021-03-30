import java.util.Scanner;

public class AskName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in your last name: ");
        String name = sc.next();
        System.out.print("Type in your first name: ");
        name = sc.next() + " " + name;
        System.out.print("Type in your age: ");
        int age = sc.nextInt();
        sc.close();
        System.out.println("You are " + name + " and your age is " + age + " years.");
    }
}