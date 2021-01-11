package behavioralPatterns.observer;

public class HexadecimalObserver extends Observer {

    public HexadecimalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexadecimal: " + Integer.toHexString(subject.getState()));
    }
}
