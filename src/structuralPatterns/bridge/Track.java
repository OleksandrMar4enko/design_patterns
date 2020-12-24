package structuralPatterns.bridge;

public class Track extends Vehicle {

    public Track(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("track drives...");
    }
}
