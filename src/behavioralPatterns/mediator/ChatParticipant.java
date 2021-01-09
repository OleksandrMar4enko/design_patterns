package behavioralPatterns.mediator;

public class ChatParticipant extends User {

    public ChatParticipant(Mediator mediator, String nickName) {
        super(mediator, nickName);
    }

    @Override
    public void send(String message) {
        System.out.printf("%s writes message: %s %n", this.nickName, message);
        mediator.sendMessage(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.printf("%s receive message: %s %n", this.nickName, message);
    }
}
