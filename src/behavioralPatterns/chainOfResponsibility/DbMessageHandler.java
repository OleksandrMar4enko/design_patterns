package behavioralPatterns.chainOfResponsibility;

public class DbMessageHandler extends MessageHandler {

    @Override
    protected void printMessage(String message) {
        System.out.printf("print to db: %s %n", message);
    }
}
