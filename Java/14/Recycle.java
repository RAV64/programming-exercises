import java.util.Scanner;

interface RecyclableR {

}

public class Recycle {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        RecycleCentre greenville = new RecycleCentre();

        System.out.println("What do you want to recycle?" +
                " Choose a number.");
        System.out.println("1 - Clothes");
        System.out.println("2 - Bottles");
        System.out.println("3 - Newspapers");
        System.out.print("If you’re not interested in recycling,\n" +
                "choose another number: ");
        int choice = reader.nextInt();

        if (choice >= 1 && choice <= 3) {
            if (choice == 1) {
                Fabric rag = new Fabric();
                greenville.recycle(rag);
            } else if (choice == 2) {
                BottleR bottleR = new BottleR();
                greenville.recycle(bottleR);
            } else {
                Paper sheet = new Paper();
                greenville.recycle(sheet);
            }

        } else {
            System.out.println("Thanks for coming...");
        }
    }
}

class RecycleCentre {
    public void recycle(RecyclableR thing) {
        System.out.println(thing + " recycled...");
    }
}

class Fabric implements RecyclableR {
    public String toString() {
        return "fabric";
    }
}

class Paper implements RecyclableR {
    public String toString() {
        return "paper";
    }
}

class BottleR implements RecyclableR {
    public String toString() {
        return "bottle";
    }
}