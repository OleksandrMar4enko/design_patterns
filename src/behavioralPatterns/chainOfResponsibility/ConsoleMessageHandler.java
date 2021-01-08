package behavioralPatterns.chainOfResponsibility;

public class ConsoleMessageHandler extends MessageHandler {

    @Override
    protected void printMessage(String message) {
        System.out.printf("print to console: %s %n", message);
    }
}
