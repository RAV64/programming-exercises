public class TestClass {
    public static void main(String[] args) {
        Tool drill1, drill2, wrench;
        wrench = new Wrench(0.1, 4, 10);
        drill1 = new Drill(1.75, 175, "Black&Decker A", 1350);
        drill2 = new Drill(2, 250, "Black&Decker B", 3000);

        ((Wrench) wrench).printInfo();
        System.out.println();
        ((Drill) drill1).printInfo();
        System.out.println();
        ((Drill) drill2).printInfo();
    }
}

abstract class Tool {
    private final double weight;
    private final int price;

    public Tool(double p, int h) {
        weight = p;
        price = h;
    }

    public double ReturnWeight() {
        return weight;
    }

    public int ReturnPrice() {
        return price;
    }

    public abstract void printInfo();
}

class Wrench extends Tool {
    private final int size;

    public Wrench(double p, int h, int size) {
        super(p, h);
        this.size = size;
    }

    public void printInfo() {
        System.out.println("Weight: " + ReturnWeight() + " kg");
        System.out.println("Price: " + ReturnPrice() + " euros");
        System.out.println("Size: " + this.size);
    }
}

class Drill extends Tool {
    private final String model;
    private final int rpm;

    public Drill(double p, int h, String model, int rpm) {
        super(p, h);
        this.model = model;
        this.rpm = rpm;
    }

    public void printInfo() {
        System.out.println("Weight: " + ReturnWeight() + " kg");
        System.out.println("Price: " + ReturnPrice() + " euros");
        System.out.println("Model: " + this.model);
        System.out.println("Revolution speed: " + this.rpm);
    }
}