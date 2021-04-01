import java.util.Scanner;

interface Recyclable {
    void recycle();
}

public class Interfaces {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the name of the soda: ");
        String name = reader.nextLine();

        System.out.print("Type in the volume of the bottle: ");
        double size = reader.nextDouble();

        SodaBottle soda = new SodaBottle(size, name);
        System.out.println(soda);
        soda.recycle();
    }
}

class Bottle{
    private final double volume;

    Bottle(double volume) {
        this.volume = volume;
    }

    public double returnVolume(){
        return volume;
    }
}

class SodaBottle extends Bottle implements Recyclable {
    private final String name;

    SodaBottle(double volume, String name) {
        super(volume);
        this.name = name;
    }

    public String toString(){
        return name + ", " + returnVolume() + " litres";
    }

    public void recycle() {
        System.out.println("Bottle returned for recycling.");
    }
}