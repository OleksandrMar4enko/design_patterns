package behavioralPatterns.command;

public class App {

    public static void main(String[] args) {

        Cat cat = new Cat();

        Command up = new SwitchOnCommand(cat);
        Command down = new SwitchOffCommand(cat);

        Selector selector = new Selector(up, down);
        selector.switchOn();
        selector.switchOff();
    }
}
