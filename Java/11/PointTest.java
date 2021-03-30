import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in the first values of the coordinates:");
        System.out.print("x: ");
        int x = reader.nextInt();
        System.out.print("y: ");
        int y = reader.nextInt();

        Point point = new Point(x, y);

        System.out.println("Point is now at : " + point);
        System.out.println("Type in the change of x and y coordinates");
        System.out.print("x: ");
        x = reader.nextInt();
        System.out.print("y: ");
        y = reader.nextInt();

        point.move(x, y);
        System.out.println("Point is now at: " + point);
    }
}

class Point {
    private int x;
    private int y;

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public Point(int x, int y) {
        x = Math.min(x, 100);
        x = Math.max(x, 0);
        y = Math.min(y, 100);
        y = Math.max(y, 0);
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        x += this.x;
        y += this.y;
        x = Math.min(x, 100);
        x = Math.max(x, 0);
        y = Math.min(y, 100);
        y = Math.max(y, 0);
        this.x = x;
        this.y = y;
    }
}
