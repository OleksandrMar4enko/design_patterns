package structuralPatterns.bridge;

public class Audi implements Model {

    @Override
    public void drive(String str) {
        System.out.println("audi " + str);
    }
}
