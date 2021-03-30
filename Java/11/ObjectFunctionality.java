import java.util.Scanner;


public class ObjectFunctionality {
    public static void main(String[] args) {
        PrinterOF thing = new PrinterOF();
        thing.Print();
    }
}

class PrinterOF {
    public void Print(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in the first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Type in the second integer: ");
        int num2 = sc.nextInt();
        int sum = CalculatorOF.Sum(num1,num2);
        System.out.println("Sum of the numbers: " + sum);
    }
}

class CalculatorOF {
    static int Sum(int first, int second) {
        return first + second;
    }
}