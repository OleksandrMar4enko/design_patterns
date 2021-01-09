package behavioralPatterns.memento;

public class App {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");

        originator.setState("State 2");
        caretaker.add(originator.save());

        originator.setState("State 3");
        caretaker.add(originator.save());

        originator.setState("State 4");
        System.out.printf("Current state: %s %n", originator.getState());

        originator.load(caretaker.get(0));
        System.out.printf("First saved state is: %s %n", originator.getState());

        originator.load(caretaker.get(1));
        System.out.printf("Second saved state is: %s %n", originator.getState());
    }
}
