package learn;

public class AbstractMethodApp {
    public static void main(String[] args) {
        Animal animal = new Cat(); //ini Polymorphisme
        animal.name = "Bonbon";
        animal.run();
    }
}
