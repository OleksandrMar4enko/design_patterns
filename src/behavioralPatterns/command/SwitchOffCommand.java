package behavioralPatterns.command;

public class SwitchOffCommand implements Command {

    private Cat cat;

    public SwitchOffCommand(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void run() {
        cat.appear();
    }
}
