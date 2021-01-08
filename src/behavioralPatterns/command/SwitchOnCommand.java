package behavioralPatterns.command;

public class SwitchOnCommand implements Command {

    private Cat cat;

    public SwitchOnCommand(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void run() {
        cat.hide();
    }
}
