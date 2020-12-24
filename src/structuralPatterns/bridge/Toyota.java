package structuralPatterns.bridge;

public class Toyota implements Model {

    @Override
    public void drive(String str) {
        System.out.println("toyota " + str);
    }
}
