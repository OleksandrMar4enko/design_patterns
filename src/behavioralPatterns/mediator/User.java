package behavioralPatterns.mediator;

public abstract class User {

    protected Mediator mediator;
    protected String nickName;

    public User(Mediator mediator, String nickName) {
        this.mediator = mediator;
        this.nickName = nickName;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
