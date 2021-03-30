class CommandLineCalculator {
    public static void main(String[] args) {
        int characters = args.length;

        if (characters < 3)
            System.out.println("You did not type in a calculation!");
        else if (characters % 2 == 0)
            System.out.println("Invalid number of command line parameters.");
        else {
            Calculator counter = new Calculator();
            counter.count(args);
        }
    }
}

class Calculator {
    public void count(String[] args) {
        int total = 0;
        System.out.print("Result of the calculation");
        for (int i = 0; i < args.length; i++) {
            System.out.print(" " + args[i]);
            if (i % 2 != 0) {
                if (args[i].equals("+")) {
                    total += Integer.parseInt(args[i + 1]);
                } else if (args[i].equals("-")) {
                    total -= Integer.parseInt(args[i + 1]);
                }
            }
        }
        total += Integer.parseInt(args[0]);
        System.out.print(" is " + total);
    }
}