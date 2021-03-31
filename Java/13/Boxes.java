class Box {

    private boolean lidOpen;
    private String contents;

    public Box(String s) {
        lidOpen = false;
        contents = s;
    }

    public void clearContents() {
        System.out.println("You emptied the box");
        contents = "";
    }

    public void openLid() {
        if (lidOpen) {
            System.out.println("Lid was already open!");
        } else {
            lidOpen = true;
            System.out.println("Lid opened.");
        }
    }

    public void tellContents() {
        String lClosed = "Lid is closed, contents unknown!";
        String lOpen = "Box contents: " + contents;
        String noContents = "Box doesn't contain anything..";
        if (lidOpen) {
            if (contents.length() > 0) {
                System.out.println(lOpen);
            } else System.out.println(noContents);
        } else {
            System.out.println(lClosed);
        }
    }

    public void addContents(String content) {
        contents += content;
    }
}

class LockBox extends Box {

    private boolean isLocked;

    public LockBox(String s) {
        super(s);
        isLocked = true;
    }

    public void openLock() {
        System.out.println("Lock opened");
        isLocked = false;
    }

    public void openLid() {
        if (isLocked) {
            System.out.println("Lock must be opened first!");
        } else {
            super.openLid();
        }
    }
}


public class Boxes {
    public static void main(String[] args) {
        Box BoxA = new Box("sand");
        LockBox BoxB = new LockBox("rocks");
        LockBox BoxC = new LockBox("pepes");

        System.out.println("Box A:");
        BoxA.tellContents();
        BoxA.openLid();
        BoxA.tellContents();
        BoxA.clearContents();
        BoxA.tellContents();
        BoxA.addContents("a bloody knife");
        BoxA.tellContents();

        System.out.println();
        System.out.println("Box B: ");
        BoxB.tellContents();
        BoxB.openLid();
        BoxB.openLock();
        BoxB.openLid();
        BoxB.tellContents();
        BoxA.clearContents();
        BoxA.tellContents();
        BoxA.addContents("another box");
        BoxA.tellContents();

        System.out.println();
        System.out.println("Box B: ");
        BoxC.tellContents();
        BoxC.openLid();
        BoxC.openLock();
        BoxC.openLid();
        BoxC.tellContents();
        BoxC.clearContents();
        BoxC.tellContents();
        BoxC.addContents("a child");
        BoxC.tellContents();
    }
}
