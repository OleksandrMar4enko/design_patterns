package structuralPatterns.bridge;

public class Car extends Vehicle {

    public Car(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("car drives...");
    }
}
