package behavioralPatterns.mediator;

public class App {


    public static void main(String[] args) {

     Mediator mediator = new ChatMediator();

     User admin = new ChatParticipant(mediator, "Admin");
     User user = new ChatParticipant(mediator, "User");

     mediator.addUser(admin);
     mediator.addUser(user);

     user.send("Hi");
     admin.send("Hi");
    }
}
