class Dog11 {
    int age;
    String name, race, sound;

    public Dog11(int age, String name, String race, String sound) {
        this.age = age;
        this.name = name;
        this.race = race;
        this.sound = sound;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Race: " + race);
    }

    public String makeSound() {
        return sound;
    }
}

public class DogTest11 {
    public static void main(String[] args) {
        Dog11 rover = new Dog11(2, "Rover", "Dalmatian", "Woof!!!");
        Dog11 rex = new Dog11(4, "Rex", "Australian terrier", "woofwoof");

        System.out.println("Dog info:");
        rover.printInfo();
        System.out.println("Dog says: " + rover.makeSound());
        System.out.println();
        rex.printInfo();
        System.out.println("Dog says: " + rex.makeSound());
    }
}