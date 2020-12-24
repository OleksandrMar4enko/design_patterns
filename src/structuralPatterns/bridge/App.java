package structuralPatterns.bridge;

public class App {

    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Audi());
        vehicle.drive();
        Vehicle vehicle2 = new Track(new Toyota());
        vehicle2.drive();
    }

}
