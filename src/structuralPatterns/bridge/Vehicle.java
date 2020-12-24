package structuralPatterns.bridge;

public abstract class Vehicle {

    Model model;

    public Vehicle(Model model) {
        this.model = model;
    }

    abstract void drive();
}
