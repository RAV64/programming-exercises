import java.util.Stack;

public class StackExercise {
    public static void main(String[] args) {

        Stack<String> strStack = new Stack<>();
        Stack<Integer> iStack = new Stack<>();
        strStack.push("Norway");
        strStack.push("Sweden");
        strStack.push("Finland");
        strStack.push("Iceland");
        strStack.push("Russia");
        iStack.push(1);
        iStack.push(11);
        iStack.push(111);
        iStack.push(2);
        iStack.push(22);
        iStack.push(222);

        System.out.println("character strings of strStack and their lengths:");
        while (!strStack.empty()) {
            String cs = strStack.pop();
            System.out.println(cs + " (" + cs.length() + " characters)");
        }
        System.out.println();

        System.out.print("iStack: ");
        System.out.println(iStack);
        int sum = 0;
        while (!iStack.empty()) {
            sum += iStack.pop();
        }
        System.out.println("Sum: " + sum);
    }
}